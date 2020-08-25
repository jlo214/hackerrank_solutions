/*
jlo214
06/02/2020
https://www.hackerrank.com/challenges/java-date-and-time/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        //had to refresh on java calendar abstract class  
        Calendar mycalobj =  Calendar.getInstance();  
        // set the year,month and day   
        // calendar class was being weird w/setting month 12 was giving Jan and 11 was giving Dec. had to adjust (today's date was 6/2/2020 maybe it was fixed in the future)
        mycalobj.set(year, month-1, day);  
        String res = String.valueOf(mycalobj.getTime());

        if(res.contains("Sun"))
            return "SUNDAY";  
        if(res.contains("Mon"))
            return "MONDAY";  
        if(res.contains("Tue"))
            return "TUESDAY";  
        if(res.contains("Wed"))
            return "WEDNESDAY";          
        if(res.contains("Thu"))
            return "THURSDAY";
        if(res.contains("Fri"))
            return "FRIDAY";
        if(res.contains("Sat"))
            return "SATURDAY"; 
        return "ERROR";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateAndTime.findDay(month, day, year);
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}