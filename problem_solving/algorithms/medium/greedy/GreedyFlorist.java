/*
jlo214
07/2020
https://www.hackerrank.com/challenges/greedy-florist/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GreedyFlorist {

    static int getMinimumCost(int k, int[] c) {
        //solo attempt, created a Friend class
        int len = c.length;
        Arrays.sort(c);
        int total = 0;
        int flowerPrice = 0;
        
        Friend[] f = new Friend[k];
        for(int i=0; i<k; i++){
            f[i] = new Friend(i+1, 0);
        }

        for(int i=len-1, index=0; i>=0; i--, index++){
            if(index >= k) { index = 0; }
            Friend temp = f[index];
            flowerPrice = (temp.getFlowersBought()+1)* c[i];
            
            temp.addFlower(1);            
            total += flowerPrice;
        }
        return total;
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

        int minimumCost = getMinimumCost(k, c);
        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();
        
        bufferedWriter.close();
        scanner.close();
    }
}

class Friend {
    private int number;
    private int flowersBought;
    
    public Friend(){
        
    }
    
    public Friend(int number, int flowersBought){
        this.number = number;
        this.flowersBought = flowersBought;
    }
    
    public int getNumber(){
        return number;
    }
    public int getFlowersBought(){
        return flowersBought;
    }
    
    public void addFlower(int num){
        flowersBought += num;
    }
    
    @Override
    public String toString(){
        return "friend num: "+number+" fBought: "+flowersBought;
    }
}
