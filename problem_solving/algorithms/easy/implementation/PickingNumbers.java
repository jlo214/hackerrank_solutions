/*
jlo214
05/2020
https://www.hackerrank.com/challenges/picking-numbers/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {
        //had to look up algo, didn't know how to approach problem
        int res = 0;
        Collections.sort(a);
        int[] counts = new int[a.get(a.size()-1) +1];
        
        for(int i=0; i<a.size(); i++){
            int index = a.get(i);
            counts[index]++;
        }

        for(int k=1; k<counts.length; k++)
            res = Math.max(res, counts[k] + counts[k-1]);
        
        return res;
    }
}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
