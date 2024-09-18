package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("","",0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {    //()안에 비워줘야 함
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
