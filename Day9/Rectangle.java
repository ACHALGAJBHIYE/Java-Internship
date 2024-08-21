import java.util.Scanner;

public class Rectangle
{
    //instance variable
    int length;
    int breadth;
    int area;

    Scanner sc = new Scanner(System.in);

    void readData()
    {
        System.out.println("Enter length - ");
        length = sc.nextInt();
        System.out.println("Enter Breadth - ");
        breadth = sc.nextInt();
    }

    // Calculate area 
    void area()
    {
      area = length * breadth;
    }

    //Print Area
    void displayArea()
    {
        System.out.println("Area of Rectangle = " + area);
    }
    
}
class Demo
{
    public static void main(String[] args)
    {
        //Object create
        Rectangle s1 = new Rectangle();

        //Called Method
        s1.readData();
        s1.area();
        s1.displayArea();

    }
}