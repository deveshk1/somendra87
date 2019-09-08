package java8.lamdademos;

interface Calculator
{
    int add(int num1, int num2);
}

class Calculate implements Calculator
{

    @Override
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
}

public class AddByLamdaDemo
{
    public static void main(String[] args)
    {
        Calculator calculator = (a,b)-> a+b;
        System.out.println(calculator.add(30,50));
    }
}
