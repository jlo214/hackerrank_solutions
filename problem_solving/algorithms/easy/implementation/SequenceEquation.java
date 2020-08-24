/*
jlo214
05/2020
https://www.hackerrank.com/challenges/permutation-equation/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceEquation {
    //solo, brute force, O(n^2)
    static int[] permutationEquation(int[] p) {

        int len = p.length;
        int[] res = new int[len];

        for(int i=0; i<len; i++){
            int x= i+1;
            int tempIndex = 0;
            for(int j=0; j<len; j++){
                if(p[j] == x){
                    tempIndex = j+1;
                    break;
                }
            }
            
            for(int k=0; k<len; k++){
                if(p[k] == tempIndex)
                    res[i] = k+1;
            }
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];
        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}