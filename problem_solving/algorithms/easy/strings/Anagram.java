/*
jlo214
06/2020
https://www.hackerrank.com/challenges/anagram/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {

    static int anagram(String s) {
        //solo, brute force
        //split string in 2 halves 
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2, s.length());
        int[] counts = new int[26];
        int count = 0;                

        //if not equal sizes return -1
        if(s1.length() != s2.length())
            return -1;
        
        //if equal keep going 
        for(int i=0; i<s2.length(); i++){
            int s2Index = (int) s2.charAt(i) - 'a';
            counts[s2Index]++;

            int s1Index = (int) s1.charAt(i) - 'a';
            counts[s1Index]--;
        }                    

        for(int j: counts){
            if(j>0)
                count+=j;
        }           
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}