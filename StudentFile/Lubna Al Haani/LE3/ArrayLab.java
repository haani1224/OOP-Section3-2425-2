import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part A : Spot the Errors no. 1 and 2
        double gpa[] = new double[4]; // Change (4) to [4]

        int[] points = {90, 85, 88}; // shorthand initialization

        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }
        System.out.println("Highest score: " + findHighestScore(scores));


        // Part B: no.4
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Part B: no.5
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(3.4);
        grades.add(4.0);
        grades.add(2.5);

        // method call for Part B: no.6
        printAverage(new int[] {10, 20, 30, 40});

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Ali", 20);
        students[1] = new Student("Siti", 21);
        students[2] = new Student("Raj", 19);

        // method call for Part C: no.8
        printStudentInfo(students);

        input.close();
    }

    // Part A: Spot the error no.3
    public static void printTotal(String title, int... values) { // swap parameter place
        // ...
    }

    // Part B: no.6
    public static void printAverage(int[] num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        int average = sum / num.length;
        System.out.println("Average: " + average);
    }

    // Part C: no.7
    public static int findHighestScore(int[] scores) {
        int highest = 0;
        for (int h : scores) {
            if(h > highest) {
                highest = h;
            }
        }
        return highest;
    }

    // Part c: no.8
    public static void printStudentInfo(Student[] arr) {
        for (Student s : arr) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
    }
}

// Student class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}