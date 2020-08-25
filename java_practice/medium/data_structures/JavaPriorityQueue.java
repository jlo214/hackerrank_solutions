/*
jlo214
07/2020
https://www.hackerrank.com/challenges/java-priority-queue/problem
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/** Create the Student and Priorities classes here.*/
class Student{
    private int id;
    private String name;
    private double cgpa;

    //constructor
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.cgpa = cgpa;
    }

    //accessor methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
    @Override
    public String toString(){
        return name+" "+cgpa+" "+id;
    }

}

 class Priorities{

    public static List<Student> getStudents(List<String> events){

        PriorityQueue<Student> pQueue = new PriorityQueue<Student>(events.size(), new StudentComparator()); 

        for(int i=0; i<events.size(); i++){
            //System.out.println(events.get(i));
            String s = events.get(i);
            String op = s.length() == 6 ? s : s.substring(0,s.indexOf(" "));
            
            if(op.equalsIgnoreCase("ENTER")){ //put into the pQueue
                String[] tStudent = s.split(" ");
                Student stu = new Student( Integer.parseInt(tStudent[3]), tStudent[1], Double.parseDouble(tStudent[2]) );
                pQueue.add(stu);
            }
            else if (op.equalsIgnoreCase("SERVED")){ //remove from pQueue
                pQueue.poll();
            }
        }

        Student first = pQueue.poll();
        List<Student> res = new ArrayList<>();

            if( first == null){
                return res;
            }
            else{
                while(first != null){
                    res.add(first);
                    first = pQueue.poll();
                }
            }
        return res;
    }
 }

 class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        //1
        if( (-1 * Double.compare(s1.getCgpa(), s2.getCgpa())) == 0  ){
            //2
            if( s1.getName().compareTo(s2.getName()) == 0 ){
                //3
                if( Integer.compare(s1.getId(), s2.getId()) == 0  ){
                    return 0;
                }
                else if( Integer.compare(s1.getId(), s2.getId()) == 1 ){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else{
                return s1.getName().compareTo(s2.getName());
            }
        }
        else{
            return -1 * Double.compare(s1.getCgpa(), s2.getCgpa());
        }
    }
 }


public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}