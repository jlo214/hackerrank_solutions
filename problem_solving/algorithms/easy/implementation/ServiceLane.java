/*
jlo214
05/2020
https://www.hackerrank.com/challenges/service-lane/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ServiceLane {

    static int[] serviceLane(int n, int[][] cases, int[] width) {
        //solo, brute force
        int start = 0;
        int end = 0;
        int[] res = new int [cases.length];
                          
        for (int row=0; row<cases.length; row++) {
            start = cases[row][0];
            end = cases[row][1];
            int maxWidth = findMaxWidth(start, end, width);
            res[row] = maxWidth;
        }        
        return res;
    }
    
    public static int findMaxWidth(int start, int end, int[] width){
        int res = Integer.MAX_VALUE;

        for (int i=start; i<=end; i++) {
            if(width[i]<res)
                res = width[i];
        }  
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nt[0]);
        int t = Integer.parseInt(nt[1]);
        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];
        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n, cases, width);
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
