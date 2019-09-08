package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Course
{
    String cid() default "c-111";
    String courseName() default "C-programming language";
    int courseCost() default 5000;
}



class Student
{
    private String studentId;
    private String studentName;
    private String studnetAddress;

    public Student(String studentId, String studentName, String studnetAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studnetAddress = studnetAddress;
    }

    @Course(cid = "C-333", courseName = "JAVA", courseCost = 30000)
    public void getStudentDetails()
    {
        System.out.println("Student details : ");
        System.out.println("------------------------------------");
        System.out.println("Student id : "+ studentId);
        System.out.println("Student name : "+studentName);
        System.out.println("Studnet address : "+ studnetAddress);
        System.out.println("------------------------------------");
    }
}

public class CustomAnnotationDemo
{
    public static void main(String[] args) throws NoSuchMethodException
    {
        Student s = new Student("S-111", "somendra","bangalore");
        s.getStudentDetails();
        System.out.println("Meta data for student which is course details : ");
        //prepare class objet
        Class c = s.getClass();
        Method method = c.getMethod("getStudentDetails");
        Annotation an = method.getAnnotation(Course.class);
        Course course = (Course) an;
        System.out.println("Course details:");
        System.out.println("-----------------------------------");
        System.out.println("Course id :" +course.cid());
        System.out.println("Course name :"+ course.courseName());
        System.out.println("Course cost : "+course.courseCost());
        System.out.println("------------------------------------");
    }
}
