import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {
    @Test
    public void length() throws Exception {
        assertTrue (PasswordChecker.minLength ("5ssP2hjk"));
    }
    @Test
    public void specialCharacter() throws Exception {
        assertFalse (PasswordChecker.specialCharReg ("Abc1efhi"));
    }
    @Test
    public void lower() throws Exception {
        assertFalse (PasswordChecker.lowerCaseReg ("ABID1NG?"));
    }

    @Test
    public void upperCase() throws Exception {
        assertFalse (PasswordChecker.upperCaseReg ("sdfffkt6"));
    }

    @Test
    public void digit() throws Exception {
        assertFalse (PasswordChecker.digitReg ("sdfffktr"));
    }

    @Test
    public void existsReg() throws Exception {
        assertFalse (PasswordChecker.existsReg ("terrfdsk"));
    }
}
