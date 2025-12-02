public class Book {
    String title;
    String author;
    int year;

    void printInfo() {
        System.out.println("titl: " + title + "  author: " + author + "   year" + year);
    }
    
    void isNew() {
        if (year > 2020) {
            System.out.println("книга новая");   
        }
    }
}
