package java8.misc;

class A
{
    A(){
        System.out.println("class a");
    }
}

class B extends A{
    B(){
        System.out.println("class b");
    }
}
public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        A a = new B();
        B b = new B();

    }
}
