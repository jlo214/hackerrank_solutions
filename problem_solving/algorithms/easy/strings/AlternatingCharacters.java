/*
jlo214
04/2020
https://www.hackerrank.com/challenges/alternating-characters/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        //looked up algo, however i understood it. 
        //my own algo was overcomplicated using a tmpSting and searching for existing AA or BB and inserting new vals to tmpString
        int sLength = s.length();
        int deletions =  0;
        
        for(int i=1; i<sLength; i++){
            if(s.charAt(i-1) == s.charAt(i))
                deletions++;            
        }
        return deletions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}