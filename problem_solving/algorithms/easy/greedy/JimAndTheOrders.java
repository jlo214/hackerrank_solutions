/*
jlo214
08/04/2020
https://www.hackerrank.com/challenges/jim-and-the-orders/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JimAndTheOrders {

    static int[] jimOrders(int[][] orders) {
        //solo, but looked up hashmap part, orig started w/2d arraylist but didn't know how to sort
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<orders.length; i++){
            int oNum = orders[i][0];            
            int prepTime = (oNum) + (orders[i][1]);
            map.put(i+1, prepTime);
        }
            
        List<Map.Entry<Integer,Integer>> fOrders = new ArrayList<>(map.entrySet());
        Collections.sort(fOrders, (o1,o2) -> (o1.getValue().compareTo(o2.getValue())));
        
        int[] a = new int[fOrders.size()];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : fOrders) {
            a[index] = entry.getKey();
            index++;
        }

        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        int[] result = jimOrders(orders);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) 
                bufferedWriter.write(" ");            
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}