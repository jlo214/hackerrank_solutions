/*
jlo214
08/12/2020
https://www.hackerrank.com/challenges/maximizing-xor/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximizingXor {

    static int maximizingXor(int l, int r) {
        int maxXor = Integer.MIN_VALUE;
        
        if(l < 0 || r < 0)
            return 0;

        for(int i=l; i<=r; i++){
            for(int j=i; j<=r; j++){
                if( (i^j) > maxXor)
                    maxXor = i^j;
            }
        }
        return maxXor;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}