/*
jlo214
09/19/2020
https://www.hackerrank.com/challenges/missing-numbers/problem

Logic:
 - Traverse the complete array (brr) and keep the numbers and counts of each number using a hashmap
 - Traverse the incomplete array (arr) and subtract each number occurance from the existing map containing the complete array (brr) counts 
 	at the end of this traversal we will have a map that will contain the missing numbers, all other numbers should have a count of 0
 - Iterate through hashmap and if the count of the key is bigger than 0 (1 or more) then we take the key and store it in an arraylist
 	at the end of this iteration we will have a arraylist that will contain all the missing numbers 
 - Use java sort to get ascending order with O(n log n) time complexity
 - Create a int array of size of the arraylist 
    loop through the arraylist and cast to int and store each val in array
 - Return this array of type int
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MissingNumbersSolution {

    // Complete the missingNumbers function below.
	static int[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<brr.length; i++){
            Integer curCount = map.containsKey(brr[i]) ? map.get(brr[i]) : 0;
            map.put(brr[i], curCount+1);
        }
        
        //System.out.println("before map: "+map);
        for(int j=0; j<arr.length; j++){
            Integer curCount = map.containsKey(arr[j]) ? map.get(arr[j]) : 0;
            
            if(map.containsKey(arr[j]))
                map.put(arr[j], curCount-1);
        }
        //System.out.println("after map: "+map);

        List<Integer> res = new ArrayList<>();
        Iterator mapIterator = map.entrySet().iterator();
        while(mapIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            int count = (int) mapElement.getValue();
            int key = 0;
            
            if(count > 0){
                key = (int) mapElement.getKey();
                res.add(key);
            }
        }
        
        //System.out.println("sorted res: ");
        Collections.sort(res);
        //res.stream().forEach((a) -> System.out.print(a+" "));
        //System.out.println("");
        
        int[] sortedRes = new int[res.size()];
        for(int a=0; a<res.size(); a++){
            sortedRes[a] = (int) res.get(a);
        }
        
        return sortedRes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

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
