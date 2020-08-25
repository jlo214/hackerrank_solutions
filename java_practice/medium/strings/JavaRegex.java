/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-regex/problem
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

	//Write your code here
	/*looked up solution but I studied and understood the regex break down and how it works*/
class MyRegex {
    String format = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = format+"\\."+format +"\\."+format +"\\."+format;
    //public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}