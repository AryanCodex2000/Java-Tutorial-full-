public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        book1.printBook();
        book2.printBook();
    }
    
}
