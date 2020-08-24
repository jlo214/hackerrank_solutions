/*
jlo214
04/2020
https://www.hackerrank.com/challenges/repeated-string/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    static long repeatedString(String s, long n) {
    //knew i didn't have to build the string but had to look up algo and explanation 
    //https://www.youtube.com/watch?v=1fqNjZ1Gsxs

        long whole = n / s.length();
        int remainder = (int) (n % s.length());
        long found = 0l;
        
        for (char ch: s.toCharArray()){
            if(ch == 'a')
                found++;            
        }

        long total = found * whole;

        if (remainder == 0)
            return total;        
        else {
            String leftOver = s.substring(0,remainder);

            for (char ch: leftOver.toCharArray()) {
                if(ch == 'a')
                    total++;                
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
