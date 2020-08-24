/*
jlo214
02/2020
https://www.hackerrank.com/challenges/plus-minus/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        //stores ratios w/precision
        double[] results = new double[3];
        double posCount = 0.0;
        double negCount = 0.0;
        double zeroCount = 0.0;
        double posRatio = 0.0;
        double negRatio = 0.0;
        double zeroRatio = 0.0;
        double arrLength = arr.length;
        DecimalFormat df2 = new DecimalFormat("0.000000");

        //traverse the arr
        for(int j = 0; j < arr.length; j++){
            //pos
            if(arr[j] > 0)
                posCount += 1;            
            //neg
            else if(arr[j] < 0 )
                negCount += 1;            
            //0
            else
                zeroCount += 1;            
        }

        //find ratios
        posRatio = posCount / arrLength;
        negRatio = negCount / arrLength;
        zeroRatio = zeroCount / arrLength;

        results[0] = posRatio;
        results[1] = negRatio;
        results[2] = zeroRatio;

        for(int j = 0; j < results.length; j++){
            System.out.println(df2.format(results[j]));
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
        scanner.close();
    }
}
