/*
jlo214
04/2020
https://www.hackerrank.com/challenges/tutorial-intro/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IntroToTutorialChallenges {

    static int introTutorial(int V, int[] arr) {
        //redid using binarySearch for practice, looked up mid formula and params for bSearch(). 
        int arrLength = arr.length;
        int result = binarySearch(arr, 0, arrLength-1, V);
        
        if (result == -1) 
            return -1;
        else
            return result;     
    }

    static int binarySearch(int[] arr, int start, int end, int V){
            //int mid = (arr.length-1) / 2; //causes overflow don't use
            int mid = start + (end - start) / 2;
            
            if(V == arr[mid]){
                return mid;
            }
            if(V < arr[mid]){
                return binarySearch(arr, start, mid-1, V);
            }
            if(V > arr[mid]){
                return binarySearch(arr, mid+1, end, V);
            }
            return -1;
    }

    /*
    static int introTutorial(int V, int[] arr) {

        int arrLength = arr.length;

        for(int i=0; i<arrLength; i++){
            if(arr[i] == V)
                return i;            
        }
        return -1;
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int V = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = introTutorial(V, arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
