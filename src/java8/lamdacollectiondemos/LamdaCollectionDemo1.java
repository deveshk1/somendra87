package java8.lamdacollectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*
class MyComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer I1, Integer I2)
    {

        //return (I1<I2)?-1:((I1>I2)?+1:0);

        if (I1<I2)
        {
            return -1;
        }
        else if (I1>I2)
        {
            return +1;
        }
        else
        {
            return 0;
        }
    }
}
*/

public class LamdaCollectionDemo1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(26);
        integerList.add(0);
        integerList.add(24);
        integerList.add(76);
        integerList.add(89);
        integerList.add(56);
        System.out.println("Before Sorting");
        System.out.println(integerList);//in list insersion order is preserved
        System.out.println("-----------------------------");
        Comparator<Integer> c = (I1, I2)-> (I1<I2)?-1:((I1>I2)?+1:0);;
        Collections.sort(integerList, c);
        System.out.println("After Sorting");
        System.out.println(integerList);

        System.out.println("------------------------------");
        System.out.println("Collecting the even numbers into a list : ");
        List<Integer> l2 = integerList.stream().filter(i->i%2==0).collect(Collectors.toList());
        l2.stream().forEach(i-> System.out.println(i));
        System.out.println(l2);
    }
}
