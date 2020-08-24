/*
jlo214
05/2020
https://www.hackerrank.com/challenges/diagonal-difference/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        //looked up algo, didn't know how to intantiate, load data, or traverse 2d aList
        int n = arr.size();
        int leftSum = 0;
        int rightSum = 0;
        int res = 0;
        
        for(int i=0; i<n; i++){
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get((n-1)-i);
        }

        res = Math.abs(leftSum - rightSum);
        return res;
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }

        int result = DiagonalDifference.diagonalDifference(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
