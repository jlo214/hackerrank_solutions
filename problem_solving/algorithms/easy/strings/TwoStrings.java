/*
jlo214
05/2020
https://www.hackerrank.com/challenges/two-strings/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        //lookup
        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            if(s1.indexOf(c) != -1 && s2.indexOf(c) != -1)
            	return "YES";
        }
        return "NO";
    }

    /*
    static String twoStrings(String s1, String s2) {
        //solo
        int[] counts = new int[26];

        for(int i=0; i<s1.length(); i++){
            int temp = s1.charAt(i) - 'a';
            counts[temp]++;
        }

        for(int i=0; i<s2.length(); i++){
            int temp = s2.charAt(i) - 'a';
            
            if(counts[temp] != 0)
                return "YES";            
        }
        return "NO";
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}