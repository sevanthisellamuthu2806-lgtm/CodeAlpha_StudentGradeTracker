import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        int total = 0;
        int highest = students.get(0).marks;
        int lowest = students.get(0).marks;

        System.out.println("\n----- Student Report -----");

        for(Student s : students) {

            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);

            total += s.marks;

            if(s.marks > highest)
                highest = s.marks;

            if(s.marks < lowest)
                lowest = s.marks;
        }

        double average = total / students.size();

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
