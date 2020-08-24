/*
jlo214
05/2020
https://www.hackerrank.com/challenges/equality-in-a-array/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {
        //solo, brute force 
        int arrL = arr.length;
        int[] counts = new int[101];
        int maxVal = 0;
        int deleteCount = 0;
        
        for(int i=0; i<arrL; i++){
            counts[arr[i]] += 1;

            if(counts[arr[i]] > counts[maxVal])
                maxVal = arr[i];            
        }
        
        for(int j=0; j<arrL; j++){
            if(arr[j] != maxVal)
                deleteCount++;            
        }
        return deleteCount;
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

        int result = equalizeArray(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
