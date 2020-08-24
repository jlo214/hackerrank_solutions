/*
jlo214
05/2020
https://www.hackerrank.com/challenges/icecream-parlor/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IceCreamParlor {

    static int[] icecreamParlor(int m, int[] arr) {
        //look up, optimized from O(n^2)
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            int y = m - x;
            
            Integer j = map.get(y);
            if(j != null){
                result[0] = j +1;
                result[1] = i +1;
                break;
            }
            
            map.put(x,i);
        }
        return result;
    }

    /*
    static int[] icecreamParlor(int m, int[] arr) {
        //solo, brute force
        int[] res = new int[2];

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == m){
                    if(i<j){
                        res[0] = i+1;
                        res[1] = j+1;
                    }
                    else{
                        res[0] = j+1;
                        res[1] = i+1;                        
                    }
                }
            }
        }
        return res;
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];
            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) 
                    bufferedWriter.write(" ");                
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}