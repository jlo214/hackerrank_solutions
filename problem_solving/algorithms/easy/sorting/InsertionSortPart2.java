/*
jlo214
04/2020
https://www.hackerrank.com/challenges/insertionsort2/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSortPart2 {

    static void insertionSort2(int n, int[] arr) {
        //looked up, but studied
        for (int i = 1; i < arr.length; i++) {        
            for(int j=i; j>0; j--){
                if( arr[j] < arr[j-1] ){
                    int tempVal = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tempVal;
                }
                else
                    break;                
            }
            printArray(arr);
        }
     }
    
    static void printArray(int[] arr){
        for(int j: arr){
            System.out.print(j+" ");
        }
        System.out.println(" ");
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

        insertionSort2(n, arr);
        scanner.close();
    }
}