package annotations;

import java.time.LocalDate;

@SuppressWarnings("ALL")
public class Book {

    @Id // annotation disponível para utilização, por enquanto sem um significado
    private final int id;

    @MaxLength(80) // se a annotation possuir mais de um método é obrigatório escrever o value
    private final String title;

    @Date(format = "dd/MM/yyyy")
    private final LocalDate releaseDate;

    public Book(int id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

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
