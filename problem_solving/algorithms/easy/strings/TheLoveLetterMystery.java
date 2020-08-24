/*
jlo214
04/2020
https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheLoveLetterMystery {

    //had help
    static int theLoveLetterMystery(String s) {

        int size = s.length();
        int i = size/2 - 1;
        int j = 0;
        int count = 0;
        
        if(size % 2 == 0) 
            j = size / 2;        
        else 
            j = i + 2;        
        
        for(; i >= 0 && j <= size; i--, j++){
            count = count + Math.abs(s.charAt(i) - s.charAt(j) );
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

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}