import java.util.LinkedHashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class ValidateSald {
    public static String validateWithFullDetails(String idNumber) {
        if (idNumber == null) return "NULL INPUT";
        if (idNumber.length() < 6) return "INVALID (ID too short - must be 13 digits)";
        
        Map<String, String> checks = new LinkedHashMap<>();
        checks.put("Length (13 digits)", 
            idNumber.length() == 13 ? " PASSED" : " FAILED (Length: " + idNumber.length() + ")");
        
        if (idNumber.length() == 13) {
            checks.put("Numeric only", 
                idNumber.matches("\\d+") ? " PASSED" : " FAILED (Contains non-digits)");
            checks.put("Valid date (YYMMDD)", validateDate(idNumber.substring(0, 6)));
            checks.put("Gender digits (SSSS)", validateGender(idNumber.substring(6, 10)));
            checks.put("Citizenship (0/1)", validateCitizenship(idNumber.substring(10, 11)));
            checks.put("Luhn checksum", validateLuhn(idNumber));
        }
        
        StringBuilder result = new StringBuilder();
        boolean allValid = true;
        
        result.append("\nValidation Results:\n");
        result.append("-----------------\n");
        
        for (Map.Entry<String, String> entry : checks.entrySet()) {
            result.append(String.format("%-20s: %s\n", entry.getKey(), entry.getValue()));
            if (!entry.getValue().startsWith("")) allValid = false;
        }
        
        if (allValid && idNumber.length() == 13) {
            result.append("\nAdditional Information:\n");
            result.append("----------------------\n");
            result.append(String.format("%-15s: %s\n", "Gender", getGender(idNumber)));
            result.append(String.format("%-15s: %s\n", "Citizenship", getCitizenship(idNumber)));
        }
        
        result.append("\nFINAL VERDICT: ")
             .append(allValid ? "VALID SA ID" : "INVALID ID")
             .append("\n-----------------");
        
        return result.toString();
    }
    
    private static String validateDate(String dateStr) {
        try {
            String yy = dateStr.substring(0, 2);
            String mm = dateStr.substring(2, 4);
            String dd = dateStr.substring(4, 6);
            String century = (Integer.parseInt(yy) <= 21) ? "20" : "19";
            LocalDate.parse(century + yy + "-" + mm + "-" + dd,
                DateTimeFormatter.ofPattern("uuuu-MM-dd")
                .withResolverStyle(ResolverStyle.STRICT));
            return " PASSED";
        } catch (Exception e) {
            return " FAILED (Invalid date)";
        }
    }
    
    private static String validateGender(String digits) {
        try {
            int num = Integer.parseInt(digits);
            return (num >= 0 && num <= 9999) ? " PASSED" : " FAILED";
        } catch (Exception e) {
            return " FAILED";
        }
    }
    
    private static String validateCitizenship(String digit) {
        return digit.matches("[01]") ? " PASSED" : " FAILED";
    }
    
    private static String validateLuhn(String idNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = idNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(idNumber.charAt(i));
            if (alternate) {
                digit *= 2;
                if (digit > 9) digit = (digit % 10) + 1;
            }
            sum += digit;
            alternate = !alternate;
        }
        return (sum % 10 == 0) ? " PASSED" : " FAILED";
    }
    
    private static String getGender(String idNumber) {
        int genderCode = Integer.parseInt(idNumber.substring(6, 10));
        return genderCode >= 5000 ? "Male" : "Female";
    }
    
    private static String getCitizenship(String idNumber) {
        return idNumber.charAt(10) == '0' ? "SA Citizen" : "Permanent Resident";
    }
}
