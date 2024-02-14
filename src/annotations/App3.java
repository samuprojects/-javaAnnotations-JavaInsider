package annotations;

public class App3 {

    public static void main(String[] args) {

        Item bookItem = Book.class.getAnnotation(Item.class);
        System.out.println(bookItem);

        Item fictionBookItem = FictionBook.class.getAnnotation(Item.class);
        System.out.println(fictionBookItem);
    }
}
