/*
jlo214
02/2020
https://www.hackerrank.com/challenges/simple-array-sum/problem
Given an array of integers, find the sum of its elements.
For example, if the array ar = [1,2,3], 1+2+3 = 6, so return 6.
*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int finalRes = 0;

         for(int i = 0; i < ar.length; i++){
             int tempVal = ar[i];
             finalRes = finalRes + tempVal;
         }
        return finalRes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());
        int[] ar = new int[arCount];
        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
