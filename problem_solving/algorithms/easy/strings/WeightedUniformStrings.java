/*
jlo214
06/2020
https://www.hackerrank.com/challenges/weighted-uniform-string/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    static String[] weightedUniformStrings(String s, int[] queries) {
        //looked up but had the right approach. I was parsing the chars into int values             and storing in array, changed to hash and also changed logic to store each                  possible contig string "abccddde" would be a,b,c,cc,d,dd,ddd,e
        Set<Integer> counts = new HashSet<>();
        int lastCharVal = 0;
        int contigCount = 1;
        
        for(int i=0; i<s.length(); i++){
            int index = ((int) s.charAt(i) - 'a') + 1;

            if(index == lastCharVal)
                contigCount++;            
            else{
                contigCount = 1;
                lastCharVal = index;
            }

            int num = (index) * contigCount;
            counts.add(num);
        }
        
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<queries.length; i++){
            if(counts.contains(queries[i]))
                res.append("Yes"+" ");
            else
                res.append("No"+" ");
        }

        String[] fin = res.toString().split(" ");
        return fin;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];
        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) 
                bufferedWriter.write("\n");            
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}