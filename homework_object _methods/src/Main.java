public class Main {

    public static void main(String[] args) {
        Author author = new Author("Vladimir", "Nabokov");
        Book book = new Book("Pale fire", 1962, author);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название книги: " + book.getBook());
        System.out.println("Год публикации : " + book.getYear());

        System.out.println();

        Author author1 = new Author("Stephen", "King");
        Book book2 = new Book("It", 1986, author1);
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println("Название книги: " + book2.getBook());
        System.out.println("Год публикации : " + book2.getYear());
        book2.setYear(2077);
        System.out.println("Год публикации : " + book2.getYear());

        System.out.println();

        System.out.println("book2.toString() = " + book.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book2.equals() = " + book.equals(book));
        System.out.println("book2.equals() = " + book2.equals(book2));
        System.out.println("Хеш код автора " + book.getAuthor() + " " + author.hashCode());
        System.out.println("Хеш код автора " + book2.getAuthor() + " " + author1.hashCode());
        System.out.println("Хеш код книги " + book.getBook() + " " + book.hashCode());
        System.out.println("Хеш код книги "+ book2.getBook() + " " + book2.hashCode());
    }
}