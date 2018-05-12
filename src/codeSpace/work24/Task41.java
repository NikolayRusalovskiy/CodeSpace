package codeSpace.work24;

public class Task41 {
    public static void main(String[] args) {
        Book book = new Book();
        getInfoBook(book);
        System.out.println("======================================================");
        book.setAuthor("Ivan Pertov");
        book.setCountPage(365);

        book.getViewBook();
        System.out.println("-----------------------------------------------------------------");
        Book warAndPeace = new Book("Lev Tolstoy","WarAndPeace");
        warAndPeace.getViewBook();
    }

    public static void getInfoBook(Book book) {
        System.out.println("ID = " + book.getId());
        System.out.println("Title = " + book.getTitle());
        System.out.println("Autor = " + book.getAuthor());
        System.out.println("Publish = " + book.getPublish());
        System.out.println("Year = " + book.getYear());
        System.out.println("Page = " + book.getCountPage());
        System.out.println("Price = " + book.getPrice());
    }
}
