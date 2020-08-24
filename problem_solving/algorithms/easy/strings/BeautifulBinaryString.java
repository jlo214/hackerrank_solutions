/*
jlo214
04/2020
https://www.hackerrank.com/challenges/beautiful-binary-string/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    static int beautifulBinaryString(String b) {
        //looked up solution
        String tmpString = b;
        int steps = 0;
               
        while( tmpString.indexOf("010") != -1 ){
            tmpString = tmpString.replaceFirst("010", "011");
            steps++;
        }
        return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();
        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}