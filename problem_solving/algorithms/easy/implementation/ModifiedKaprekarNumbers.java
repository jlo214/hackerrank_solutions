/*
jlo214
07/31/2020
https://www.hackerrank.com/challenges/kaprekar-numbers/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    static void kaprekarNumbers(int p, int q) {
        //solo, but looked up how to create left and right
        StringBuilder res = new StringBuilder();
        
        for(int i=p; i<=q; i++){
            int num = i;
     
            long squared = (long) num * num;
            String str   = String.valueOf(squared);
            String left  = str.substring(0, str.length() / 2);
            String right = str.substring(str.length() / 2);
            int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
            int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);

            if( numL+numR == num )
                res.append(num+" ");            
        }
        
        if(res.length() != 0)
            System.out.println(res);        
        else
            System.out.println("INVALID RANGE");        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);
        scanner.close();
    }
}
