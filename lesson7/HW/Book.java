package lesson7.HW;

public class Book implements Comparable<Book>{
    private String name;
    private int pages;

    public Book (String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int compBookName = book.getName().compareTo(this.getName());
        if (compBookName == 0) {
            return 0;
        }
        return 1;
    }
}
