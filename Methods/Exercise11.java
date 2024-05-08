// 11. Write a Java method to check whether a string is a valid password.
// Password rules:
// A password must have at least ten characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.

// Expected Output:

// 1. A password must have at least eight characters.                                             
// 2. A password consists of only letters and digits.                                         
// 3. A password must contain at least two digits                                        
// Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
// Password is valid: abcd1234 

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("A password must have at least ten characters.");
        System.out.println("A password consists of only letters and digits");
        System.out.println("A password must contain at least two digits");
        System.out.print("Password rules: ");
        String input = sc.nextLine();
        System.out.println(isValid(input));
    }

    public static boolean isValid(String password){
        String passwordRegex = "^(?=.*[0-9].*[0-9])[A-Za-z0-9]{10,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        return pattern.matcher(password).matches();
    }
}
