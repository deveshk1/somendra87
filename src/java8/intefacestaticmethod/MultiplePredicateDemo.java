package java8.intefacestaticmethod;

import java.util.Arrays;
import java.util.function.Predicate;

public class MultiplePredicateDemo
{
    public static void main(String[] args)
    {
        Integer[] randNumArray = {12, 34, 56, 0, 2, 3, 5, 87, 14, 21, 65};
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i > 10;

        System.out.println("Numbers which are even and greater than 10 in the given array are:");
        for (int i : randNumArray)
        {
            if (p1.and(p2).test(i))
            {
                System.out.println(i);
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Numbers which are neither even nor greater than 10 :");
        Arrays.stream(randNumArray)
                .filter(i->i%2!=0)
                .filter(integer -> integer<10)
                .forEach(
                (intNum)-> System.out.println(intNum)
        );

        System.out.println("---------------------------------------");
        System.out.println("Numbers which are not even :");



    }
}
