/*
jlo214
02/2020
https://www.hackerrank.com/challenges/solve-me-first/problem
Complete the function solveMeFirst to compute the sum of two integers.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
      	// Hint: Type return a+b; below 
        return a+b;
   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
