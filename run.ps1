# Run tests with detailed output
Write-Host "RUNNING TESTS..." -ForegroundColor Cyan
 = .\gradlew.bat clean test --console=plain

# Check if tests were successful
if ( -match "BUILD SUCCESSFUL") {
    Write-Host "
ALL TESTS PASSED - STARTING APPLICATION
" -ForegroundColor Green
    java -cp "build/classes/java/main;build/resources/main" Main
} else {
    Write-Host "
TESTS FAILED - FIX ERRORS FIRST
" -ForegroundColor Red
    # Show test report location
    Write-Host "View detailed test report at: file:///C:\Users\Wiseman\.gradle\validate_sa_id\validate_sa_id/build/reports/tests/test/index.html" -ForegroundColor Yellow
}
