/*
jlo214
03/2020
https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingRecords {

    static int[] breakingRecords(int[] scores) {

       int scoresLength = scores.length;
       int highest = scores[0];
       int lowest = scores[0];
       int[] highestArr = new int[scoresLength];
       int[] lowestArr = new int[scoresLength];
       int[] results = new int[2];
       
       for(int i=0; i<scoresLength; i++){
           if(i == 0) {
               highestArr[0] = highest;
               lowestArr[0] = lowest;
           }
           else if(scores[i] > highest) 
               highest = scores[i];           
           else if (scores[i] < lowest) 
               lowest = scores[i];
           
            highestArr[i] = highest;
            lowestArr[i] = lowest;
       }

       for(int x=0; x<scoresLength-1; x++) {           
           if(highestArr[x]<highestArr[x+1])
               results[0] = results[0]+1;   

           if(lowestArr[x]>lowestArr[x+1]) 
               results[1] = results[1]+1;                                 
       }
       return results;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
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
