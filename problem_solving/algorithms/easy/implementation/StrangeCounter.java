/*
jlo214
06/2020
https://www.hackerrank.com/challenges/strange-code/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrangeCounter {

    static long strangeCounter(long t) {
        //looked up, knew it was a math formula but had no idea on approach 
        long i = 0;
        long lValue = (long) (3* Math.pow(2,i)) - 2;
        long hValue = 2 * lValue + 1;
        
        while(hValue < t){
            lValue = (long) (3* Math.pow(2,++i)) - 2;
            hValue = 2 * lValue + 1;
        }
        return hValue + 1 - t;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
