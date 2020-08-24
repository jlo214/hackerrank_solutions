/*
jlo214
06/2020
https://www.hackerrank.com/challenges/game-of-thrones/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GameOfThrones1 {

    static String gameOfThrones(String s) {
        //solo
        int[] counts = new int[26];
        int unPairedCount = 0;
        
        for(int i=0; i<s.length(); i++){
            int index = (int) s.charAt(i) - 'a';
            counts[index]++;
        }
        
        for(int i=0; i<counts.length; i++){
            counts[i] = counts[i]%2;
        }
        
        for(int i: counts){
            if(i>0)
                unPairedCount += i;
        }   
    
        String res = (unPairedCount == 1 || unPairedCount == 0) ? "YES" : "NO";
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}