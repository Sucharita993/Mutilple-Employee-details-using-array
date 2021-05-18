# Mutilple-Employee-details-using-array
Creation,Display of multiple employees
In the last program we did employee details creation <br>
But it has a few loop holes, those are<br>
we cannot create multiple employee details<br>
when we select on display option without creation, it will not throw any errors<br>
in order to over come those this code is written using arrays.<br>
<br>
The first is importing scanner class, int the code i simply didnot only import Scanner class, but also complete importion of other classes if we may use in future, so that system cannot throw error.
```java
import java.util.*;
```
```java
Scanner sc = new Scanner(System.in);
```
It is always very important to close the scanner class after its usage.
```java
sc.close();
```
In the uploads, emp.java file is the child class using which objects are creation
Instance of the object creation
```java
e = new Emp[size];
```
Creation of boolean, so that we prevent display before creation and salary increment before creation
```java
 boolean r = false;
 ```
 we the above statement in case 2,3 for no records display.
 ```java
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
 ```
 
