/*
jlo214
04/2020
https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        //solved solo, mostly
        // looked at how to see divisble or not (using mod), and I also had logic to check ar[i] < ar[j] which was not needed. Also i initially set j=0, should be j=i
        int pairs = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if( (j != i) && ((ar[i]+ar[j]) % k == 0) ){
                    //System.out.println(ar[i] + ","+ar[j]);
                    pairs++;
                }
            }
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
