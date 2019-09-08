package java8.intefacestaticmethod;

import lombok.*;

import java.util.function.Consumer;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Movie
{
    private String name;
}

public class ConsumerChaining
{
    public static void main(String[] args)
    {
        Movie fastAndFurious = new Movie();
        fastAndFurious.setName("Furious8");

        Consumer<Movie> consumerMovie = System.out::println;
        consumerMovie.accept(new Movie("The A Team"));

        Consumer<Movie> c2 = n-> System.out.println(n+ " released but flopped");
        Consumer<Movie> c3 = t -> System.out.println(t + " hit movie");

        Consumer<Movie> consumerChain = consumerMovie.andThen(c2).andThen(c3);

        Movie movie = new Movie("Spyder");
        consumerChain.accept(movie);
    }
}
