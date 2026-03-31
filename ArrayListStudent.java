
package arrayliststudent;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;


public class ArrayListStudent 
{

   
    public static void main(String[] args) 
            
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        ArrayList<Student>obj=new ArrayList<>();
        
        int choise=0;
        while(choise!=6)
        {
            System.out.println("1. Add Student details");
            System.out.println("2.view student details");
            System.out.println("3.search student");
            System.out.println("4.update details");
            System.out.println("5.delete details");
            System.out.println("6.exit");
            System.out.print("enter the option : ");
            choise=sc.nextInt();
        switch(choise)
        {
            case 1:
            {
                System.out.println(" Rollno :");
                int Roll=sc.nextInt();
                System.out.println(" Name : ");
                String name=sc1.nextLine();
                System.out.println("Age :");
                int age=sc.nextInt();
                System.out.println("Course :");
                String course=sc1.nextLine();
                System.out.println("Mark :");
                double mark=sc.nextDouble();
                obj.add(new Student(Roll, name, age, course, mark));
                break;
            }
            case 2:
            {
                if(obj.isEmpty())
                {
                    System.out.println("no details found "); 
                }
                else
                {
                   for(Student obj1:obj)
                    {
                       obj1.display();
                    }
                }
                 break;
                
            }
            case 3:
            {
                System.out.println("enter the roll numner ");
                int number=sc.nextInt();
                for(Student obj1:obj)
                {
                    if(obj1.rollnumber==number)
                    {
                        obj1.display();
                        
                    }
                    else
                    {
                        System.err.println("not found ");
                    }
                }
                 break;
            }
            case 4:
            {
                System.out.println("enter the marks to be update ");
                int mark=sc.nextInt();
                for(Student obj1:obj)
                {
                    if(obj1.mark==mark)
                    {
                        System.out.print("enter the mark to be updated : ");
                        int newmark=sc.nextInt();
                        obj1.mark=newmark;
                        
                    }
                    else
                    {
                        System.out.println("mark not fount ");
                    }
                }
                
               break;  
            }
            case 5:
            {
                System.out.print("enter the roll numberto be deleted :");
                int delete=sc.nextInt();
                for(Student obj1:obj)
                {
                    if(obj1.rollnumber==delete)
                    {
                        obj.remove(obj1);
                        break;
                        
                    }
                }
                
                 
            }
            case 6:
            {
                System.out.println("exiting programm ");
                break;
            }
                
        }
        
                    
                    
        }
        
    }
    
}
