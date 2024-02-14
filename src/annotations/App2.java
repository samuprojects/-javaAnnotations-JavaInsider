package annotations;

import java.util.stream.Stream;

public class App2 {

    public static void main(String[] args) throws NoSuchFieldException {

        Stream
                .of(Book.class.getAnnotations())
                .forEach(System.out::println);

        Stream
                .of(Book.class.getDeclaredField("title").getAnnotations())
                .forEach(System.out::println);

        MaxLength maxLength = Book.class.getDeclaredField("title").getAnnotation(MaxLength.class);
        System.out.println(maxLength.value());

    }
}
