/*
jlo214
08/01/2020
https://www.hackerrank.com/challenges/priyanka-and-toys/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PriyankaAndToys {

    static int toys(int[] w){
        int containers = 1;

        if(w.length > 1){
            Arrays.sort(w);
                
            int index = w[0];

            for(int i=0; i<w.length; i++){
                if(w[i] > index+4) {
                    containers++;
                    index = w[i];
                }
            }
        }
        return containers;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] w = new int[n];
        String[] wItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }

        int result = toys(w);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        
        bufferedWriter.close();
        scanner.close();
    }
}