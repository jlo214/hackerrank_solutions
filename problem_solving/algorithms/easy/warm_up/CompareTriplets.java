/*
jlo214
02/2020
https://www.hackerrank.com/challenges/compare-the-triplets/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            ArrayList<Integer> results = new ArrayList<Integer>();
            int alicePts = 0;
            int bobPts = 0;

            //assuming both arrays are equal in size
            for(int i = 0; i < a.size(); i++ ){
                //alice gets point
                if(a.get(i) > b.get(i)){
                    alicePts += 1;
                }
                //bob gets point
                else if (a.get(i) < b.get(i) ){
                    bobPts += 1;
                }
            }
            
            //add the vals to the array (w/alice first)
            results.add(alicePts);
            results.add(bobPts);

            return results;            
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );
        bufferedReader.close();
        bufferedWriter.close();
    }
}
