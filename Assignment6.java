import java.util.*;
import java.lang.Math;


//1. Create a class Student with 2 data members rollno and name. Create one method setData()
//    that takes roll number and student name as parameter and stores them in data members
//    rollno and name. Create one more method showData() to print the data member values.
//    Create another class ( main class) StudentDemo that creates Student class object and
//    calls setData() and showData() methods.

class Student
{
    int rollno;
    String name;
    
    void setData(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    
    void showData()
    {
        System.out.println("ID: "+rollno);
        System.out.println("Name: "+name);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Student obj=new Student();
        obj.setData(12345,"Sumit");
        obj.showData();
    }
}




//2. Create a class Circle that has two data members, one to store the radius and
//    another to store area and three methods first init() method to input radius
//    from user, second calculateArea() method to calculate area of circle and third
//    display() method to display values of radius and area. Create class CircleDemo
//    (main class) that creates the Circle object and calls init(), calculateArea() and display() methods.

class Circle
{
    int radius;
    float area;
    
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius=sc.nextInt();
    }
    
    void calculateArea()
    {
        area=(float)(22/7.0f)*(radius*radius);
    }
    
    void display()
    {
        System.out.println("Area: "+area);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Circle obj=new Circle();
        obj.init();
        obj.calculateArea();
        obj.display();
    }
}





//3. Create a class MathOperation that has four static methods. add() method that takes
//    two integer numbers as parameter and returns the sum of the numbers. subtract() method
//    that takes two integer numbers as parameter and returns the difference of the numbers.
//    multiply() method that takes two integer numbers as parameter and returns the product.
//    power() method that takes two integer numbers as parameter and returns the power of first
//    number to second number. Create another class Demo (main class) that takes the two numbers
//    from the user and calls all four methods of MathOperation class by providing entered numbers
//    and prints the return values of every method.

class MathOperation
{
    static int add(int a, int b)
    {
        return a+b;
    }
    
    static int subtract(int a, int b)
    {
        if(b>a)
            return b-a;
        else
        return a-b;
    }
    
    static int multiply(int a, int b)
    {
        return a*b;
    }
    
    static double power(int a, int b)
    {
        return Math.pow(a,b);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("a: ");
        int a=sc.nextInt();
        System.out.println("b: ");
        int b=sc.nextInt();
        
        System.out.println(MathOperation.add(a,b));
        System.out.println(MathOperation.subtract(a,b));
        System.out.println(MathOperation.multiply(a,b));
        System.out.println(MathOperation.power(a,b));
    }
}



//4. Create a class MathOperation containing overloaded methods ‘multiply’ to calculate
//    multiplication of following arguments. 
//    a. two integers 
//    b. three floats 
//    c. all elements of array 
//    d. one double and one integer 

class MathOperation
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    
    double multiply(float a, float b, float c)
    {
        return a*b*c;
    }
    
    double multiply(int arr[])
    {
        double pro=0;
        for(int i=0;i<arr.length;i++)
        {
            pro=pro+arr[i];
        }
        return pro;
    }
    
    double multiply(double a, int b)
    {
        return a*b;
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Int a: ");
        int a=sc.nextInt();
        System.out.print("Int b: ");
        int b=sc.nextInt();
        
        System.out.print("Float c: ");
        float c=sc.nextFloat();
        System.out.print("Float d: ");
        float d=sc.nextFloat();
        System.out.print("Float e: ");
        float e=sc.nextFloat();
        
        System.out.print("Enter Array Length: ");
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            System.out.print("a[i+1]: ");
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Double f: ");
        double f=sc.nextDouble();
        System.out.print("Int g: ");
        int g=sc.nextInt();
        
        MathOperation obj=new MathOperation();
        
        System.out.println("\nDouble a*b: "+obj.multiply(a,b));
        System.out.println("Double c*d: "+obj.multiply(c,d,e));
        System.out.println("Double e*f: "+obj.multiply(arr));
        System.out.println("Double g*h: "+obj.multiply(a,b));
    }
}