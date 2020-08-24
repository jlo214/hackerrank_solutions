/*
jlo214
02/2020
https://www.hackerrank.com/challenges/mini-max-sum/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long minSum = 0;
        long maxSum = 0;        
        
        Arrays.sort(arr);
        
        for(int j=0; j<arr.length-1; j++)
            minSum += arr[j];
                
        for(int k=1; k<arr.length; k++)
            maxSum += arr[k];        
        
        System.out.println(+minSum +" "+ maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);
        scanner.close();
    }
}
