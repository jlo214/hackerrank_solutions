/*
jlo214
06/2020
https://www.hackerrank.com/challenges/closest-numbers/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumbers {

    static int[] closestNumbers(int[] arr) {
        //solo
        Arrays.sort(arr);
    
        int minDiff = Integer.MAX_VALUE;        
        StringBuilder res = new StringBuilder("");

        for(int i=0; i<arr.length-1; i++){
            int tmpDiff = Math.abs(arr[i]-arr[i+1]);
            
            if(tmpDiff < minDiff){
                res.setLength(0);
                res.append(arr[i]+" ");
                res.append(arr[i+1]+" ");
                minDiff = tmpDiff;
            }
            else if (tmpDiff == minDiff){
                res.append(arr[i]+" ");
                res.append(arr[i+1]+" ");
            }            
        }

        String[] fRes = res.toString().split(" ");
        int[] finalRes = new int[fRes.length];
        
        for(int i=0; i<fRes.length; i++){
            finalRes[i] = Integer.valueOf(fRes[i]); 
        }
        return finalRes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) 
                bufferedWriter.write(" ");            
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}