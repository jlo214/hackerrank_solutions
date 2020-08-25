/*
jlo214
04/2020
https://www.hackerrank.com/challenges/java-stdin-stdout/problem
*/
import java.util.Scanner;

public class JavaStdinAndStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = String.valueOf(scan.nextLine());

        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}