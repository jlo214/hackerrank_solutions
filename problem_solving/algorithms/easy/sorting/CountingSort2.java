/*
jlo214
05/2020
https://www.hackerrank.com/challenges/countingsort2/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingSort2 {

    static int[] countingSort(int[] arr) {
    //used as ref: https://www.baeldung.com/java-counting-sort
    //part 1 of algo - creating the frequency arr 
        //creating counts arr and updating the counts 
        //and also determining how many elements are less than or equal to each element 
        //ex: 0 elements are less than or equal to 0 
        //3 elements are less than or equal to 1 
        //4 elements are less than or equal to 2 
        
        int[] counts = new int[100];
        int[] sorted = new int [arr.length];

        for(int i=0; i<arr.length; i++){
            int index = arr[i];
            counts[index]++;
        }
        
        for(int i=1; i<counts.length; i++){
            counts[i] += counts[i-1];    
        }

    //part 2 of algo - the sort 
        //how the sort works 
        //It iterates the input array in reverse
        //For each element i, C[i] – 1 represents the location of number i 
        //in the sorted array. This is because of the fact that there 
        //are C[i] elements less than or equal to i
        //Then, it decrements the C[i] at the end of each round

        for(int i= arr.length-1; i>=0; i--){
            int val = arr[i];
            int tmpCount = counts[val];
            sorted[tmpCount-1] = val;
            counts[val]--;
        }
        
        return sorted;
    }

    /*
    static int[] countingSort(int[] arr) {
        //solo, brute force
        int[] counts = new int[100];
        int[] res = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int index = arr[i];
            counts[index]++;
        }
        
        int count = 0;
        for(int j=0; j<counts.length; j++){
            if(counts[j] > 0){
                for(int i=1; i<=counts[j]; i++){
                    res[count] = j;
                    count++;
                }    
            }            
        }
        return res;
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

        int[] result = countingSort(arr);
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