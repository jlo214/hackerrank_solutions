/*
jlo214
05/2020
https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumAbsoluteDifferenceInAnArray {

    static int minimumAbsoluteDifference(int[] arr) {
        //looked up quicksort 
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=1; i<arr.length; i++){
            int tempDiff = Math.abs(arr[i] - arr[i-1]);
            if(tempDiff< minDiff){
                minDiff = tempDiff;
            }
        }
        return minDiff;
    }

        public static void sort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot-1);
            sort(arr, pivot+1, end);
        }
    }
     
    public static int partition(int[] arr, int p, int q){
        int pivot = q;
        int i = p-1;
        
        for(int j=p; j<=q; j++){
            if(arr[j] <= arr[q]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;        
    }

    /*
	//timed out
	static int minimumAbsoluteDifference(int[] arr) {
        //solo, brute force
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int tempDiff = Math.abs(arr[i] - arr[j]);        
                if(tempDiff < minDiff){
                    minDiff = tempDiff;
                }
            }
        }
        return minDiff;
    }
    */

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
        sort(arr, 0, arr.length-1);
        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}