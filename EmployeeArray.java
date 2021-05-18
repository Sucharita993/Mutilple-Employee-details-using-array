import java.util.*;

public class EmployeeArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        Emp[] e = null;
        boolean r = false;
        do{
            System.out.println("1.Create \n 2. Display \n 3.Rise Salary \n 4.Exit");
            int ch=sc.nextInt();
            if(ch==4)
            break;
            switch(ch)
            {
                case 1:
                System.out.println("Enter no of employees to be created:");
                int size =sc.nextInt();
                e=new Emp[size];
                for(int k=0;k<e.length;k++)
                e[k] = new Emp();
                for(int j=0;j<e.length;j++)
                e[j].create();
                r=true;
                break;
                case 2:
                if(r)
                for(int j=0;j<e.length;j++)
                e[j].display();
                else
                System.out.println("No records\n");
                break;
                case 3:
                if(r)
                for(int j=0;j<e.length;j++)
                e[j].raisedSalary();
                else 
                System.out.println("No records \n");
                break;
                case 4:
                System.out.println("No records");
            }
        }while(true); 
        sc.close();
    
    }
}