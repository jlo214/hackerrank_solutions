/*
jlo214
04/2020
https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDays {
    //solo
    static int beautifulDays(int i, int j, int k) {

        int beautifulCount = 0;
        double result = 0.0;
        double tempK = k;
        
        for(int a=i; a<=j; a++){
            StringBuilder test = new StringBuilder();
            test.append(a).reverse();
            
            int test2 = Integer.parseInt(test.toString());

            result = Math.abs(a-test2) / tempK;
            
            if(result%1 == 0)
                beautifulCount++;            
        }
        return beautifulCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");
        int i = Integer.parseInt(ijk[0]);
        int j = Integer.parseInt(ijk[1]);
        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
