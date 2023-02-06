public class Magazine implements Printable {
    String Magazine;
    public Magazine(String magazine) {
        Magazine = magazine;
    }
    public String getMagazine() {
        return Magazine;
    }
    public void setMagazine(String magazine) {
        Magazine = magazine;
    }
    @Override
    public void print() {
        System.out.println(getMagazine());
    }
    public static void printMagazines(Printable[] printable) {
        for (Printable printabl : printable) {
            if (printabl instanceof Magazine) {
                printabl.print();
            }

        }

    }
}
