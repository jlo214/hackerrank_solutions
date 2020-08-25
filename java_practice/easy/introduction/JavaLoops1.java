/*
jlo214
04/2020
https://www.hackerrank.com/challenges/java-loops-i/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoops1 {

    static String multiples(int n, int i){
        int multiple = n * i;
        String result = String.valueOf(n) +" x "+String.valueOf(i)+" = "+String.valueOf(multiple);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        for(int i=1; i<11; i++){
            System.out.println(multiples(N,i));
            
        }
    }
}