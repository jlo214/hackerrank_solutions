/*
jlo214
05/2020
https://www.hackerrank.com/challenges/migratory-birds/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MigratoryBirds {
    
    //solo
    static int migratoryBirds(List<Integer> arr) {

        int[] counts = new int[6];
        for(int i=0; i<arr.size(); i++){
            int index = arr.get(i);
            counts[index]++;
        }
        
        int res = 1;
        for(int j=2; j<counts.length; j++){
            if(counts[j] > counts[res])
                res = j;
        }
        
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
