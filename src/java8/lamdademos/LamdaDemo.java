package java8.lamdademos;

interface Interef
{
    void m1();
}

public class LamdaDemo
{
    public static void main(String[] args)
    {
        Interef i = ()-> System.out.println("somendra");
        i.m1();
    }
}
