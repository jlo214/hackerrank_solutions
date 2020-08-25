/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-exception-handling/problem
*/
import java.util.Scanner;
import java.lang.Math;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int n, int p) throws Exception{
        if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        if(n == 0 && p == 0)
           throw new Exception("n and p should not be zero.");
        
        long nN = Long.valueOf(n);
        long nP = Long.valueOf(p);

        //long res = Math.pow(nN,nP);
        return (long) Math.pow(nN,nP);
    }
}

public class JavaExceptionHandling2 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}