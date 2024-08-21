import java.util.Scanner;
public class Student
{
    String name;
    int age;
    char grade;
    Scanner sc = new Scanner(System.in);
    //read Input
    void readData()
    {
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter Grade:");
        grade = sc.next().charAt(0);
    }

    // display Data
    void displayData()
    {
        System.out.println("Name of Student = "+name);
        System.out.println("Age = "+age);
        System.out.println("Grade = "+grade);
    }
    public static void main(String[] args)
    {
       Student s1 = new Student();
       s1.readData();
       s1.displayData();
    }
}