/*
jlo214
04/2020
https://www.hackerrank.com/challenges/strong-password/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        //looked up how to search for special chars, nums, lower and upper case
        //but made most of algo logic on my own

        String special = "!@#$%^&*()-+";
        int strongCount = 0;
        int strongLength = 6;
        boolean containsNum = false;
        boolean containsLowerCase = false;
        boolean containsUpperCase = false;
        boolean containsSpecial = false;
        
            for(int i=0; i<n; i++){
                char currentChar = password.charAt(i);
                
                if(Character.isDigit(currentChar))
                   containsNum = true;                
                else if(Character.isLowerCase(currentChar))
                    containsLowerCase = true;                
                else if(Character.isUpperCase(currentChar))
                    containsUpperCase = true;                
                else if(special.contains(Character.toString(currentChar)))
                    containsSpecial = true;                
            }
            
            if(!containsNum)
                strongCount++;
            
            if(!containsLowerCase)
                strongCount++;
            
            if(!containsUpperCase)
                strongCount++;
            
            if(!containsSpecial)
                strongCount++;            
            
            if(n+strongCount < strongLength)
                strongCount = (strongLength - (n+strongCount)) + (strongCount);            
        
            return strongCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);
        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
