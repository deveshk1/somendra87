package java8.intefacestaticmethod;

import java.util.function.Predicate;

interface StaticMethodInsideInterface
{
    static void m1()
    {
        System.out.println("Static method inside interface");
    }
}

public class TestStaticMethodInsideInterface implements StaticMethodInsideInterface
{
    public static void main(String[] args)
    {
        StaticMethodInsideInterface.m1();
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(37));


        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setName("Somendra");
        employeeDto1.setSalary(111000);
        employeeDto1.setHavingGirlfrind(true);

        Predicate<EmployeeDto> p1 = employeeDto -> employeeDto.getSalary() > 10000 &&
                employeeDto.isHavingGirlfrind();
        System.out.println(p1.test(employeeDto1));

        String[] heros = {"Nag", "Chiranjeevi", "Venkatesh", "Sunny", "bun", "prabhas"};
        Predicate<String> p2 = s -> s.length() > 5;

        for (String s1 : heros)
        {
            if (p2.test(s1))
            {
                System.out.println(s1);
            }
        }

        //System.out.println("Checking length of string gereater than 5: " + p2.test("Somendra"));


    }
}
