import java.io.*;
import java.util.*;

class Student {
    private Integer rollNo;  
    private String name;

    public Student(Integer rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return rollNo.hashCode();   
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.rollNo.equals(s.rollNo);  
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Student> ss = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Integer rollNo = Integer.parseInt(br.readLine());
            String name = br.readLine();

            Student s = new Student(rollNo, name);
            ss.add(s);
        }

        for (Student a : ss) {
            System.out.println(a);
        }
    }
}
