/*
jlo214
05/2020
https://www.hackerrank.com/challenges/acm-icpc-team/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AcmIpcpTeam {

    static int[] acmTeam(String[] topic) {
        //solo
        int members = topic.length;
        StringBuffer topicsKnownList = new StringBuffer();
        
        for(int i=0; i< members-1; i++){
            for(int j=i+1; j<members; j++){
                int topicsKnown = 0;

                for(int z=0; z<topic[0].length(); z++){
                    if(topic[i].charAt(z) == '1' || topic[j].charAt(z) == '1')
                        topicsKnown++;                    
                }
                topicsKnownList.append(topicsKnown+" ");
            }
        }
        
        String[] topicsKnownListArr = topicsKnownList.toString().split(" ");
        int[] topicsKnownIntArr = new int[topicsKnownListArr.length];
        int teamCount = 0;
        int[] results = new int[2];
        
        for(int s=0; s<topicsKnownListArr.length; s++)
             topicsKnownIntArr[s] = Integer.valueOf(topicsKnownListArr[s]);
        
        Arrays.sort(topicsKnownIntArr);
        
        for(int k=0; k<topicsKnownIntArr.length; k++){
            if(topicsKnownIntArr[k] == topicsKnownIntArr[topicsKnownIntArr.length-1])
                teamCount++;            
        }
        results[0] = topicsKnownIntArr[topicsKnownIntArr.length-1];
        results[1] = teamCount;
        return results;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) 
                bufferedWriter.write("\n");            
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
