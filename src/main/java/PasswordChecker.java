import java.util.ArrayList;
import java.util.regex.Pattern;

public class PasswordChecker {

    public static int conditions = 0;
    static ArrayList<String> ErrorList = new ArrayList<String> ( );

    public static String passwordIsValid(String password) {
        String error = "";

        if (minLength (password)) {
            conditions++;
        } else {
            error = "password should be longer than 8 characters\n";
            ErrorList.add ("Should be longer than 8 characters");
        }

        if (existsReg (password)) {
            conditions++;
        } else {
            error = "password should exist\n";
            ErrorList.add ("password should exist");
        }

        if (digitReg (password)) {
            conditions++;
        } else {
            error = "password should at least have one digit\n";
            ErrorList.add ("should at least have one digit");
        }

        if (lowerCaseReg (password)) {
            conditions++;
        } else {
            error = "password should have at least one lowercase letter\n";
            ErrorList.add ("should have at least one lowercase letter");
        }

        if (upperCaseReg (password)) {
            conditions++;
        } else {
            error = "password should have at least one uppercase letter\n";
            ErrorList.add ("should have at least one uppercase letter");
        }

        if (specialCharReg (password)) {
            conditions++;
        } else {
            error = "password should have at least one special character\n";
            ErrorList.add ("should have at least one special character");
        }

        if (existsReg (password) && password.length ( ) <= 8)
            error = "password is never Ok!";
        return error;
    }

    public static boolean passwordIsOk(String password) {
        if (!password.isEmpty ( ) && password.length ( ) < 8) {
            return false;
        } else
            return conditions >= 3;
    }

    public static boolean minLength (String password){
        return Pattern.compile ("^[\\w{8,36}]").matcher (password).find ( );
    }

    public static boolean existsReg(String password) {
        return !Pattern.compile ("^[(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])]").matcher (password).find ( );
    }

    public static boolean digitReg(String Password) {
        return Pattern.compile ("[0-9]").matcher (Password).find ( );
    }

    public static boolean lowerCaseReg(String Password) {
        return Pattern.compile ("[a-z]").matcher (Password).find ( );
    }

    public static boolean upperCaseReg(String Password) {
        return Pattern.compile ("[A-Z]").matcher (Password).find ( );
    }

    public static boolean specialCharReg(String Password) {
        return Pattern.compile ("[$&+!~%^*()`'><_,:;=?@#|]").matcher (Password).find ( );
    }
}
