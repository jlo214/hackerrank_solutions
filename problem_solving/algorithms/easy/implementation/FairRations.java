/*
jlo214
05/2020
https://www.hackerrank.com/challenges/fair-rations/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FairRations {

    static int fairRations(int[] B) {
        //solo
        int ppl = B.length;
        int loafs = 0;
        
        for(int i=0; i<B.length-1; i++){
            if(ppl == 2) {
                if(B[i]%2 != 0 || B[i+1]%2 != 0){
                    return -1;
                }
            }
            
            if(B[i]%2 !=0){
                B[i] += 1;
                B[i+1] += 1;
                loafs += 2;
            }            
        }

        for(int i=0;i<B.length;i++) {
            if(B[i] % 2 != 0) {
              loafs=-1;
              break;
            }
        }

        return loafs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];
        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        int result = fairRations(B);
        if(result == -1)
            bufferedWriter.write(String.valueOf("NO"));        
        else
            bufferedWriter.write(String.valueOf(result));        

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
