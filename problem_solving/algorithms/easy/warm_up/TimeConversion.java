/*
jlo214
02/2020
https://www.hackerrank.com/challenges/time-conversion/problem
*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        
        String[] oVals = s.split(":");
        int oHour = Integer.parseInt(oVals[0]);
        String oMin = oVals[1];
        String oSec = oVals[2].substring(0,2);
        String period = oVals[2].substring(2,4);
        String nHour = "";      

	    if( (1 <= oHour && oHour <= 11) && ( period.equalsIgnoreCase("AM") ) )
	        nHour =  String.format( "%02d", oHour );	    
	    else if ( (1 <= oHour && oHour <= 11) && ( period.equalsIgnoreCase("PM") ) )
	        nHour = String.valueOf(oHour+12);
	    
	    
	    if( oHour == 12 && period.equalsIgnoreCase("AM") )
	        nHour = "00";	    
	    else if( oHour == 12 && period.equalsIgnoreCase("PM") )
	        nHour = String.valueOf(oHour);
	    

	    String newTime = nHour+":"+oMin+":"+oSec;
	    return newTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scan.nextLine();
        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();
        bw.close();
    }
}
