public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(" Незнайка ");
        Book book2 = new Book(" Тульский Токорев ");
        Book book3 = new Book(" Том Сойер ");

        Magazine magazine1 = new Magazine(" Свойство человека ");
        Magazine magazine2 = new Magazine(" Кросота под деревом ");
        Magazine magazine3 = new Magazine(" Откррой дверь и увидь сюрприз ");

        Printable[] printables = { book1, book2, book3, magazine1, magazine2, magazine3};
        for (Printable printable : printables){
            printable.print();
        }

        Magazine.printMagazines(printables);
        Book.printBooks(printables);









    }
}