# Run tests with colored output
function Write-TestResult {
    param([string]$line)
    
    if ($line -match "PASSED") {
        Write-Host $line -ForegroundColor Green
    }
    elseif ($line -match "FAILED") {
        Write-Host $line -ForegroundColor Red
    }
    else {
        Write-Host $line
    }
}

Write-Host "`nRUNNING TESTS...`n" -ForegroundColor Cyan

# Run gradle test and process output line by line
.\gradlew.bat clean test --console=plain | ForEach-Object {
    Write-TestResult $_
}

# Check build status
if ($LASTEXITCODE -eq 0) {
    Write-Host "`nALL TESTS PASSED - STARTING APPLICATION`n" -ForegroundColor Green
    java -cp "build/classes/java/main;build/resources/main" Main
} else {
    Write-Host "`nTESTS FAILED - FIX ERRORS FIRST`n" -ForegroundColor Red
    Write-Host "View detailed report at: file:///$pwd/build/reports/tests/test/index.html`n" -ForegroundColor Yellow
}
