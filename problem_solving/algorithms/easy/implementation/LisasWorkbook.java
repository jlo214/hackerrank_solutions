/*
jlo214
05/2020
https://www.hackerrank.com/challenges/lisa-workbook/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LisasWorkbook {

    static int workbook(int n, int k, int[] arr) {
        //had right idea, but couldn't get it
        //looked up solution
        int pg = 1;
        int count = 0;

        for (int a: arr) {
            for (int i=1; i<=a; i++) {
                if(i == pg) 
                	count++;
                if(i%k == 0) 
                	pg++;
            }
            if(a%k != 0) 
               	pg++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
