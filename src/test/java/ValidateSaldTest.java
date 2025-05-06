import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateSaldTest {
    @Test
    void testValidId() {
        assertTrue(ValidateSald.validateWithFullDetails("2001014800086").contains("VALID SA ID"));
    }

    @Test
    void testInvalidLength() {
        assertTrue(ValidateSald.validateWithFullDetails("123").contains("ID too short"));
    }

    @Test
    void testGenderIdentification() {
        assertTrue(ValidateSald.validateWithFullDetails("2001015000085").contains("Gender         : Male"));
        assertTrue(ValidateSald.validateWithFullDetails("2001014800086").contains("Gender         : Female"));
    }
}
