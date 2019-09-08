package java8.intefacestaticmethod;

import lombok.*;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
class Student
{
    private String name;
    private int marks;
}
public class FunctionDemo
{
    public static void main(String[] args)
    {
        Function<Integer, Integer> function = num -> num * num;

        System.out.println(function.apply(5));

        System.out.println("-------------------------------------------------");
        Function<String, Integer> lengthOfString = String::length;
        System.out.println("Length of the given string is : " + lengthOfString.apply("Somendra"));

        System.out.println("--------------------------------------------------");
        Function<String, String> convertStringToUpperCase = s -> s.toUpperCase();
        System.out.println("Converted to uppercase : " + convertStringToUpperCase.apply("prakash"));

        System.out.println("------------------------------------------------------------");
        System.out.println("--------- Grade of the Student Based on the marks ----------");
        System.out.println("------------------------------------------------------------");
        Function<Student, String> gradeOfTheStudent = student ->
        {
            int marks = student.getMarks();
            String grade = "";
            if (marks > 80)
            {
                grade = "A[Distinction]";
            } else if (marks > 60)
            {
                grade = "B[First Class]";
            } else if (marks > 50)
            {
                grade = "C [Second Class]";
            } else if (marks > 35)
            {
                grade = "D [Third Class]";
            } else
            {
                grade = "E[Failed]";
            }
            return grade;
        };
        Student[] students = {new Student("ANU", 89),
                new Student("ANU", 89),
                new Student("sanu", 65),
                new Student("ANU", 55),
                new Student("ANU", 46),
                new Student("ANU", 35),
                new Student("ANU", 10),
                new Student("ANU", 60),
                new Student("ANU", 79),
                new Student("ANU", 89)
        };


        Predicate<Student> studentPredicate = p -> p.getMarks() > 60;

        //Consumer for printing the student data
        Consumer<Student> studentConsumer = student ->
        {
            System.out.println("Name : " + student.getName());
            System.out.println("Markas: " + student.getMarks());
            System.out.println("Grade: " + gradeOfTheStudent.apply(student));
        };

        for (Student s1 : students)
        {
            if (studentPredicate.test(s1))
            {
                studentConsumer.accept(s1);
            }
        }

        /*Predicate<Student> predicateStudent = student -> student.getMarks() > 60;

        for (Student s1 : students)
        {
            if (predicateStudent.test(s1))
            {
                System.out.println("Student name : "+s1.getName());
                System.out.println("Student marks: "+ s1.getMarks());
                System.out.println("Student grade : "+gradeOfTheStudent.apply(s1));
            }
        }*/

        /*Arrays.stream(students).forEach(
                s -> System.out.println("Name: " + s.getName() + ", grade : " + s.getMarks() + "| Grade : "
                        + gradeOfTheStudent.apply(s)
                )
        );*/
        //System.out.println("Grade Of Student is : " + gradeOfTheStudent.apply(students));
    }
}
