/*
jlo214
05/2020
https://www.hackerrank.com/challenges/find-digits/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorials {
    //solo but looked up BigInteger methods
    static void extraLongFactorials(int n) {

        String s = String.valueOf(n);
        BigInteger num1 = new BigInteger(s);

        for(int i=1; i<n; i++)
            num1 = num1.multiply(BigInteger.valueOf(i));
        
        System.out.println(num1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);
        scanner.close();
    }
}
