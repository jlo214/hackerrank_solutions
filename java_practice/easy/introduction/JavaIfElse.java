/*
jlo214
04/2020
https://www.hackerrank.com/challenges/java-if-else/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {

    static String weirdChecker(int n){
        int remainder = n%2;

        if(remainder != 0){
            return "Weird";
        }
        else if( (remainder == 0) && (2<=n && n<=5) ){
            return "Not Weird";
        }
        else if( (remainder == 0) && (6<=n && n<=20) ){
            return "Weird";
        }
        else if( (remainder == 0) && (n>20) ){
            return "Not Weird";
        }
        return "Error";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String result = weirdChecker(N);
        System.out.println(result);
    }
}