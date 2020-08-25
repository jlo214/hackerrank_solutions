/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-biginteger/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        sc.close();

        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);

        addition(c,d);
        multiplication(c,d);
    }

    public static void addition(BigInteger c, BigInteger d){
        System.out.println(c.add(d));
    }

    public static void multiplication(BigInteger c, BigInteger d){
        System.out.println(c.multiply(d));
    }
}