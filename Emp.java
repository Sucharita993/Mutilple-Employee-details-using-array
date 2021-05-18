import java.util.Scanner;
class Emp
{
    String name;
    int age;
    double salary;
    String designation;
    Scanner sc =  new Scanner(System.in);
    public void create()
    {
        System.out.println("Enter name:");
        this.name = sc.next();
        System.out.println("Enter age: ");
        this.age = sc.nextInt();
        System.out.println("Enter salary: ");
        this.salary = sc.nextDouble();
        System.out.println("Enter designation:");
        this.designation = sc.next();
    
    }
    public void display()
    {
        System.out.println(" name " + name + "\n age " + age + "\n salary " + salary + "\n Designation " + designation + "\n");
    }
    public void raisedSalary()
    {
        this.salary = salary + 1000;
        System.out.println("salary rised");
    }
}