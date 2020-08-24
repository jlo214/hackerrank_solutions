/*
jlo214
04/2020
https://www.hackerrank.com/challenges/bon-appetit/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int splitBill = 0;
        int changeOwed = 0;

        for(int i = 0; i < bill.size(); i++)
            splitBill += bill.get(i);
        
        splitBill = (splitBill - bill.get(k)) / 2;
            
        if (b == splitBill)
            System.out.println("Bon Appetit");       
        else{
            changeOwed = b - splitBill;
            System.out.println(changeOwed);
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billItems[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());
        bonAppetit(bill, k, b);
        bufferedReader.close();
    }
}
