/*
  Program for Single level Inheritance
 */
class A
{
    int b = 10;
    A()
    {
        System.out.println("Parant Constructor");
    }
}
class B extends A
{
    int b = 20;
    B()
    {
        System.out.println("CHild Constructor");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        B obj = new B();
        System.out.println(obj.b);
    }
}
/*
   Output =>     javac .\SingleLevelInheritance.java
                 java Demo
                 Parant Constructor
                 CHild Constructor
                 20


   1. "extends" keyword use in Inheritance.
   2. Single Inheritance : When one class aquire properties and attribute of other class then Single Level Inheritance occur.
   3. When object is create Constructor is called First. If their is no Constructor then default constructor is Called.
         
 */