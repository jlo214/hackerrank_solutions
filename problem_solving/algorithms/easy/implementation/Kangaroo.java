/*
jlo214
05/2020
https://www.hackerrank.com/challenges/kangaroo/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        //had to look up algo solution and explanation, I knew it was a math problem but didn't know the approach 
        String result = "NO";

        if(v1>v2){
            int remainder = (x1-x2) % (v2-v1);
            if(remainder == 0){
                result = "YES";
                return result;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1V1X2V2[0]);
        int v1 = Integer.parseInt(x1V1X2V2[1]);
        int x2 = Integer.parseInt(x1V1X2V2[2]);
        int v2 = Integer.parseInt(x1V1X2V2[3]);
        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
