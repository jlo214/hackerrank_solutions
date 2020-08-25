/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-primality-test/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();
        
        BigInteger i = new BigInteger(n);
        //checks if prime (when param is 1) using BigInteger
        boolean res = i.isProbablePrime(1);
        if(res)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}