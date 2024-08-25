import java.util.Scanner;
public class Student
{
    int rollNo;
    String name;
    String collegeName;

    Student(int r, String n, String c){
       rollNo = r;
       name = n;
       collegeName = c;
    }
    Student()
    {
        this.rollNo = 15;
        this.name = "astha";
        this.collegeName = "Sipna";
    }
    void readInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name - ");
        name = sc.nextLine();
        System.out.println("Enter Roll number - ");
        rollNo =  sc.nextInt();
        System.out.println("Enter College Name - ");
        sc.nextLine();
        collegeName = sc.nextLine();
    }

    void displayInfo()
    {
        System.out.println("Roll number" + rollNo);
        System.out.println("Name - " + name);
        System.out.println("College Name - " + collegeName);
    }
}
class Demo {
    public static void  main(String[] args)
    {
        Student s1 =  new Student(30,"Achal", "Sipna");
        s1.readInfo();
        s1.displayInfo();

        // Student s2 =  new Student();
        // s2.displayInfo();
        // /*
        //   Student s2 =  new Student();
        //               ^
        //   required: int,String,String
        //   found:    no arguments
        //  */

        Student s3 =  new Student();
        s3.displayInfo();

    }
}
/*
 the issue specifically arises when using sc.nextInt() or similar methods (like nextDouble(), nextFloat(), etc.) in combination with sc.nextLine(). This is because these methods do not consume the newline character left in the buffer after the input. Here’s a breakdown of why this happens and how to handle it.
 */

 /*Output-
      javac Student.java
      java Demo
      Achal
      Enter Roll number -
      22
      Enter College Name -
      sipna
      Roll number22
      Name - Achal
      College Name - sipna
      Roll number15
      Name - astha
      College Name - Sipna
      Enter Name -
  */