package java8.lamdademos;

interface Intrf
{
    int squareIt(int n);
}

class Demo implements Intrf
{

    @Override
    public int squareIt(int n)
    {
        return n*n;
    }
}

public class LamdaDemo3
{
    public static void main(String[] args)
    {
        Intrf i = n -> { return n*n; };
        System.out.println(i.squareIt(4));
    }
}
