package chattingapp;

public class StaticVariableTest
{
    static final String NAME_TEST;
    static String name;

    static {
        NAME_TEST ="prakash";
    }
    public static void main(String[] args)
    {
        System.out.println(NAME_TEST);
    }
}
