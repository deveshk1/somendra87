package java8.intefacestaticmethod;

import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
    {
        Consumer<String> name = name1-> System.out.println(name1);
        name.accept("Somendra Anu ");
        name.accept("Anu ");
        name.accept("vishalakchi");

        Consumer<Student> studentConsumer = student -> {
            System.out.println("Name : "+ student.getName());
            System.out.println("Markas: "+ student.getMarks());
            System.out.println("Grade: ");
        };
        studentConsumer.accept(new Student("prakash",60));
     }


}
