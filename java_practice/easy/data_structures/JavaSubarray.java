/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-negative-subarray/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //looked at discussion and read/studied/understood algo solution found
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close(); 

        //call function
        subarrayNegSum(n, arr);
    }

    public static void subarrayNegSum(int n, int[] arr) {
        int count = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum = arr[j]+sum;
                if(sum<0) count++;
            }
        }
        System.out.println(count);
    }
}