package annotations;

import java.time.LocalDate;

@SuppressWarnings("ALL")
public class App1 {

    public static void main(String[] args) {
        Book b = new Book(10, "abc", LocalDate.now());
        int id = b.getId();
    }
}
