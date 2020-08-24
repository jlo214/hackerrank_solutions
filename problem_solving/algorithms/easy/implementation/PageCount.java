/*
jlo214
05/2020
https://www.hackerrank.com/challenges/drawing-book/problem
*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PageCount {
	//had to look up, didn't know approach
    static int pageCount(int n, int p) {
        
        int forwardTurns = n/2;
        int forwardCount = p/2;
        int reverseCount = forwardTurns - forwardCount;

        int res = Math.min(forwardCount, reverseCount);
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
