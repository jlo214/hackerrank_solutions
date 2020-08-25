/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-1d-array/problem
*/
import java.util.*;

public class Java1dArrayPt2 {
    //looked up sol, had no idea recurssion was needed, tried doing while loop, but only passed half cases then got stuck in infinite loop. found sol and ran a paper run on a test case to understand. 
    public static boolean canWin(int leap, int[] game){
        return canWin(leap, game, 0);
    }
    
    public static boolean canWin(int j, int[] game, int i){
        //base condition(s)
        if(i < 0 || game[i] == 1)
            return false;
        
        if(i == game.length-1 || i+j >= game.length)
            return true;
        
        game[i] = 1;
        
        //recurssion
        return canWin(j, game, i+1) || canWin(j, game, i+j) || canWin(j, game, i-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}