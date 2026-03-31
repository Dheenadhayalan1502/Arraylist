
package arrayliststudent;
//roll number, name, age, course, and marks/


public class Student 
{
    int rollnumber;
    String name;
    int age;
    String course;
    double mark;

    public Student(int rollnumber, String name, int age, String course, double mark) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.mark = mark;
    }
    void display()
    {
        System.out.println("Rollno : "+rollnumber);
        System.out.println("name : "+name );
        System.out.println("age : "+age );
        System.out.println("course : "+course);
        System.out.println("mark : " +mark);
    }
    
}
