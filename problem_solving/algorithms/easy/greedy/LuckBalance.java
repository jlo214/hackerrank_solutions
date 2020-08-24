/*
jlo214
06/2020
https://www.hackerrank.com/challenges/luck-balance/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {
        //looked up, but had general idea
        List<Integer> importantContests = new ArrayList<>();        
        int totalLuck = 0;
                            
        for(int i=0; i<contests.length;i++){
            totalLuck+=contests[i][0];
            if(contests[i][1] == 1)
                importantContests.add(contests[i][0]);            
        }
        
        Collections.sort(importantContests);
        
        int luckToSubtract = 0;
        int imprtContToWin = importantContests.size() - k;
        for(int j=0; j<imprtContToWin; j++){
            luckToSubtract+= importantContests.get(j);
        }
        
        int result = totalLuck - 2*luckToSubtract;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
