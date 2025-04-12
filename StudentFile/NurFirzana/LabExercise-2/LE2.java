// Name: NUR FIRZANA BINTI BADRUS HISHAM
// Matric No: A23CS0156

public class LE2 {
    public static void main(String[] args) {

        // Q1
        Employee e1 = new Employee(); 
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        // Q3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        // Q6
        new User();
        new User();
        System.out.println("\nTotal Users: " + User.getUserCount());

        // Q7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("\nSalary: RM" + e.getSalary());
    }
}

// Q1: Class and Object Creation
class Employee {
    // fields
    private int empNum;
    private String empName;
    
    // setter and getter methods
    public void setEmpNum(int number){
        empNum = number;
    }
    public int getEmpNum(){
        return empNum;
    }

    public void setEmpName(String name){
        empName = name;
    }
    public String getEmpName(){
        return empName;
    }

    // Q7: Access Modifiers
    private double salary;

    public void setSalary(double gaji){
        salary = gaji;
    }
    public double getSalary(){
        return salary;
    }
}

// Q2: Instance Variables and Data Fields
class Car{
    // declare private variables
    private String brand;
    private int year;

    // setter for brand, getter for year
    public void setBrand(String br){
        brand = br;
    }
    public int getYear(){
        return year;
    }
}

// Q3: Constructor Usage
class Book{
    private String title;
    private String author;

    // constructor
    Book(String tajuk, String penulis){
        title = tajuk;
        author = penulis;
    }

    public void display(){
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
    }
}

// Q4: Getters and Setters
class Student{
    private String name;
    private int age;

    // setter for name, getter for age
    public void setName(String nama){
        name = nama;
    }
    public int getAge(){
        return age;
    }
}

// Q5: Method Overloading
class Message{
    public void display(){
        System.out.println("Hello!");
    }

    //overload display
    public void display(String msg){
        System.out.println("Message: " + msg);
    }
}

// Q6: Static vs Non Static
class User{
    // declare static counter
    static int count;

    public User(){
        // increment counter
        count++;
    }

    public static int getUserCount(){
        // return counter
        return count;
    }
}
