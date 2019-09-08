package java8.lamdademos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Java8StreamDemo
{
    static List<String> names = getNames();
    public static List<String> getFilterdNames(String searchString)
    {
        names = names.stream().filter(name -> (name.endsWith(searchString))).collect(Collectors
                .toList());
        return names;
    }

    static List<String> getNames()
    {
        List<String> names = new ArrayList<>();
        names.add("Somendra");
        names.add("ANU");
        names.add("Ravi");
        names.add("Rakhi");
        names.add("Nimesh");
        names.add("Avnindra");
        names.add("Apoorv");
        return names;
    }

    public static void printFilteredNames(List<String> filteredNames)
    {
        filteredNames.forEach(System.out::println);
    }
}

public class StreamDemoApp
{
    public static void main(String[] args)
    {
        Java8StreamDemo.printFilteredNames(Java8StreamDemo.getFilterdNames("Ra"));
    }
}
