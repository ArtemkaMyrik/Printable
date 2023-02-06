public class Book implements Printable {
    String Book;
    public Book(String book) {
        Book = book;
    }
    public String getBook() {
        return Book;
    }
    public void setBook(String book) {
        Book = book;
    }
    @Override
    public void print() {
        System.out.println(getBook());
    }
    public static void printBooks(Printable[] printable) {
        for (Printable printabl : printable) {
            if (printabl instanceof Book) {
                printabl.print();


            }
        }
    }
}