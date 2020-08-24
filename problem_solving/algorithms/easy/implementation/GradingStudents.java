/*
jlo214
02/2020
https://www.hackerrank.com/challenges/grading/problem
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

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int l = grades.size();  
        List<Integer> finalGrades = new ArrayList<Integer>();

        for(int i = 0; i< l; i++){            
            //round rules
            int newGrade = ((grades.get(i) / 5) + 1) * 5;
        
            if(newGrade >= 40 && newGrade - grades.get(i) < 3)
                finalGrades.add(newGrade);            
            else
                finalGrades.add(grades.get(i));            
        }
            return finalGrades;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );
        bufferedReader.close();
        bufferedWriter.close();
    }
}