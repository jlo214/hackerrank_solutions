/*
jlo214
05/2020
https://www.hackerrank.com/challenges/halloween-sale/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        //solo v2
        int maxS = s;
        int tempGameCost = p;
        int gamesBought = 0;
        
        while(s >= 0){
            if(s != maxS)
                tempGameCost = tempGameCost - d;            

            if(tempGameCost < m)
                tempGameCost = m;            

            s = s - tempGameCost;

            if(s < 0)
                break;
            
            gamesBought++;
        }
        return gamesBought;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);
        int d = Integer.parseInt(pdms[1]);
        int m = Integer.parseInt(pdms[2]);
        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);
        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
