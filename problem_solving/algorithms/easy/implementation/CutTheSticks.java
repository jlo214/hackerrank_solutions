/*
jlo214
04/2020
https://www.hackerrank.com/challenges/cut-the-sticks/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        //solo algo, but looked up how to set min val to update, 
        //and outer while loop to keep track of if stick arr was empty or not

        int totalSum = -1;
        StringBuffer res = new StringBuffer();
        
        while(totalSum != 0){
            int cutLength = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++){
                if( arr[i] !=0 && arr[i]<cutLength )
                    cutLength = arr[i];                
            }
            
            totalSum = 0;
            int count = 0;            
            for(int j=0; j<arr.length; j++){
                if(arr[j] != 0){
                    arr[j] = arr[j] - cutLength;
                    count++;
                }
                totalSum = totalSum + arr[j];
            }
            res.append(count+" ");
        }
        
        String resData = res.toString();
        String[] tempResults = resData.split(" ");
        int[] results = new int[tempResults.length];
            
        for(int z=0; z<results.length; z++)
            results[z] = Integer.parseInt(tempResults[z]);
        
        return results;
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

        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) 
                bufferedWriter.write("\n");            
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
