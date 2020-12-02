package lection3.homeWork;

public class Book implements Printable {

    int id;
    String name;
    int pagesQty;

    public Book (int id, String name, int pageQty) {
        this.id = id;
        this.name = name;
        this.pagesQty = pageQty;
    }

    public static void printBooks(String name) {
        System.out.println("Book name: " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("The book was printed");
    }

    @Override
    public void printable() {
    }
}
