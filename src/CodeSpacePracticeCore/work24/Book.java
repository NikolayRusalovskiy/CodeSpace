package CodeSpacePracticeCore.work24;

public class Book {
    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, int id, String publish, int countPage, double price, int year) {
        this.author = author;
        this.title = title;
        this.id = id;
        this.publish = publish;
        this.countPage = countPage;
        this.price = price;
        this.year = year;
    }

    private String author;
    private String title;
    private int id;
    private String publish;
    private int countPage;
    private double price;
    private int year;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public  void getViewBook() {
        System.out.println("ID = " + id);
        System.out.println("Title = " + title);
        System.out.println("Autor = " + author);
        System.out.println("Publish = " + publish);
        System.out.println("Year = " + year);
        System.out.println("Page = " + countPage);
        System.out.println("Price = " + price);
    }

}
