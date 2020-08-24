/*
jlo214
04/2020
https://www.hackerrank.com/challenges/gem-stones/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Gemstones {

    static int gemstones(String[] arr) {
        
        int gemCount = 0;
        int rockNum = 0;
        int noOfRocks = arr.length;
        int[] compositions = new int[26];

        for(rockNum = 1; rockNum <= noOfRocks; rockNum++){
            String rock = arr[rockNum-1];
            generateComposition(compositions, rock, rockNum);
        }

        for(int element : compositions){
            if(element == noOfRocks)
                gemCount++;            
        }
        return gemCount;
    }

    public static void generateComposition(int[] compositions, String rock, int rockNum){

        for(int i = 0; i < rock.length(); i++) {
            int index = rock.charAt(i) - 'a';
            if(rockNum == 1)
                compositions[index] = 1;            
            else{
                if(compositions[index] >= rockNum-1)
                    compositions[index] = rockNum;                
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}