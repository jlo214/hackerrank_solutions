/*
jlo214
05/2020
https://www.hackerrank.com/challenges/making-anagrams/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2) {
        //solo
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int delete = 0;
        
        for(int i=0; i<s1.length(); i++){
            int index = (int) s1.charAt(i) - 'a';
            s1Count[index]++;
        }
        
        for(int i=0; i<s2.length(); i++){
            int index = (int) s2.charAt(i) - 'a';
            s2Count[index]++;
        }

        for(int i=0; i<s1Count.length; i++){
            int common = Math.abs(s1Count[i]-s2Count[i]);
            delete += common;
        }
        return delete;
    }


    /*
    first attempt, failed
    static int makingAnagrams(String s1, String s2) {
        int totalLetters = s1.length() + s2.length();
        int len = s2.length();
        int common = 0;
                
        for(int i=0; i<len; i++){
            if(s1.contains(s2.substring(i,i+1)))
                common+=2;            
        }
        return totalLetters-common;
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}