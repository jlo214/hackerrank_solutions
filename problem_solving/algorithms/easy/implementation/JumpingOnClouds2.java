/*
jlo214
05/2020
https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds2 {
    //solo
    static int jumpingOnClouds(int[] c, int k) {

        int n = c.length; //number of clouds
        int e = 100; //energy
        boolean completeTrip = false;
        int index = 0;
        
        while(!completeTrip){
            index = (index+k) % n;

            if(index == 0)
                completeTrip = true;            

            e-=1;
            if(c[index] == 1)
                e-=2;            
        }
        return e;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        
        int[] c = new int[n];        
        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
