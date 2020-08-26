/*
jlo214
8-25-2020
https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

ex: s = "aabbccddeefghi"
1) iterate through each char in string while keeping count of each occurance in hashmap
    now we have a map containing all chars and occurances in the map
    map: {a=2, b=2, c=2, d=2, e=2, f=1, g=1, h=1, i=1}

2) init an arraylist containing all the values from hashmap
    list: [2, 2, 2, 2, 2, 1, 1, 1, 1]

3) sort the list in asc order 
    new list: [1, 1, 1, 1, 2, 2, 2, 2, 2]

4) Now the string will be valid in 2 scenarios 
    1) if list.get(0)-1 makes all values in the list equal to each other
    2) if list.get(list.size()-1)-1 makes all values in the list equal to each other

    Why? Because the string is valid if all letters occur the same number of times 
    so this string is NOT VALID since if we take list.get(0)-1 we still have chars that occur 1 time and others that occur 2 times
    also if we take (the last value) list.get(list.size()-1)-1 we still have chars that occur 1 time and others that occur 2 times

    In a valid string all values in the list will be equal
    ex: list: [2, 2, 2, 2, 2] or [1, 1, 1, 1] 
    However since we can only delete 1 char this is not possible. 
    We would need 4 deletions or 5 deletions.

Valid string ex: "abcdefghhgfedecba"
    map: {a=2, b=2, c=2, d=2, e=3, f=2, g=2, h=2}
    unsorted list: [2, 2, 2, 2, 3, 2, 2, 2]
    sorted list: [2, 2, 2, 2, 2, 2, 2, 3]
    Second condition in step 4 is met. 3-1=2. Now all vals in list are 2.
    Therefore string is valid.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString  {

    static String isValid(String s) {        
        if(s.length() < 2) return "YES";        
        HashMap <Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            Integer count = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) : 0;
            map.put(s.charAt(i), count+1);
        }
        
        //System.out.println("map: "+map);
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        //System.out.println("values: "+values);
        
        if(values.get(0).equals(values.get(values.get(values.size()-1))))
            return "YES";
        
        if(values.get(0).equals(1)){
            values.remove(0);
            
            if(values.get(0).equals(values.get(values.size()-1)) && values.get(values.size()-1).equals(values.get(values.size()-2)) ){
                return "YES";
            }
        }
        else{
            values.set(values.size()-1, (values.get(values.size()-1))-1);
            
            if(values.get(0).equals(values.get(values.size()-1))){
                return "YES";
            }
        }
        //System.out.println("new values: "+values);
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}