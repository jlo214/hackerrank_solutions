/*
jlo214
06/2020
https://www.hackerrank.com/challenges/runningtime/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RunningTimeOfAlgorithms {

    static int runningTime(int[] arr) {
        //took code from insertion sort 2
        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j=i; j>0; j--) {
                if( arr[j] < arr[j-1] ){
                    int tempVal = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tempVal;
                    shifts++;
                }
                else
                    break;                
            }
        }
        return shifts;
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

        int result = runningTime(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
