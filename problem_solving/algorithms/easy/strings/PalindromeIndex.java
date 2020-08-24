/*
jlo214
06/2020
https://www.hackerrank.com/challenges/palindrome-index/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PalindromeIndex {

    static int palindromeIndex(String s) {
        //looked up sol
        int palinIndex = -1;
        int len = s.length();
        
        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                boolean rightStringPalin = isPalind(s.substring(i+1, len-i));

                if(rightStringPalin)
                    return i;
                return len-1-i;
            }
        }
        return palinIndex;
    }

    public static boolean isPalind(String str){
        int len = str.length();
        
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i))
                return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}