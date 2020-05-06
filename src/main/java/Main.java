import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        out.print("Hi, Some few rules of the house\n" +
                "password should exist\n" +
                "password should have at least one lowercase letter\n" +
                "password should have at least one uppercase letter\n" +
                "password should at least have one digit\n" +
                "password should have at least one special character \n" +
                "password should be longer than 8 characters\n");
        out.println("-------------------------------------------------------");

        out.print("Please enter a Password: \n");
        Scanner input = new Scanner(in);
        String password;
        password = input.nextLine();
        out.println((PasswordChecker.passwordIsValid (password)));
        out.println((PasswordChecker.passwordIsOk(password)));
        out.println("-------------------------------------------------------");
        out.println("-------------------------------------------------------");
        main(args);
    }
}

