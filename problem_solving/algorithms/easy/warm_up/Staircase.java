/*
jlo214
02/2020
https://www.hackerrank.com/challenges/staircase/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

	//looked up    
    static void staircase(int n) {

          // outer loop to handle number of rows 
        for(int i=1; i<=n; i++) {   
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(int j=1; j<=n-i; j++) { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(int j=1; j<=i; j++){
                // printing stars 
                System.out.print("#");             
            }
              
            // ending line after each row 
            System.out.println(); 
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);
        scanner.close();
    }
}
