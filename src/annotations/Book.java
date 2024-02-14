package annotations;

import java.time.LocalDate;

@SuppressWarnings("ALL")
public class Book {

    @Id
    private final int id;

    @MaxLength(80)
    private final String title;

    @Date(format = "dd/MM/yyyy")
    private final LocalDate releaseDate;

    public Book(int id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    @Role("admin")
    @Role("guest")
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }


}
