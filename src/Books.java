//Дочерний класс 1
public class Books extends Publications {
    // Поля
    private String book_author;
    int number_pages;
    protected String editor_book;
    //Конструктор 1
    public Books(String id1, String book_author, int number_pages, String editor_book) {
        this.id = id1;
        this.book_author = book_author;
        this.number_pages = number_pages;
        this.editor_book = editor_book;
    }
    // Конструктор 2 (пустой)
    public Books() {
    }
    //Переопределение метода number1
    @Override
    public void number1() {
        System.out.println("ID book = " + id  + "\n" + "Author book: " + book_author);
    }
    //Переопределение метода number2
    @Override
    public void number2() {
        System.out.println("ID book = " + id + "\n" + "Editor: " + editor_book + "\n" + "Book's author : " + book_author + "\n" + "Number pages = " + number_pages);
    }
    //getter,setter  для book_author
    public String getBook_author() {
        return book_author;
    }
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

}

