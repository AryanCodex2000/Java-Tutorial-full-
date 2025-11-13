public class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void printBook(){
        System.out.println("Book: " + title + " by " + author + " | ISBN: " + ISBN);
    }
}