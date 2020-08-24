/*
jlo214
04/2020
https://www.hackerrank.com/challenges/insertionsort1/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSortPart1 {

    static void insertionSort1(int n, int[] arr) {
        //solved solo
       int tmpVal = arr[arr.length-1];
       
       for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > tmpVal){
               arr[i+1] = arr[i];
               navArr(arr);
           }
           else {
               arr[i+1] = tmpVal;
               navArr(arr);
               i = -1;
           }
            if(i==0){
                arr[i] = tmpVal;
                navArr(arr);
            }
       }        
     }
     
    static void navArr(int[] arr){     
        for(int j: arr){
           System.out.print(j+" ");
       }
       System.out.print("\n");
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

        insertionSort1(n, arr);
        scanner.close();
    }
}