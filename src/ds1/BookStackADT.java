package ds1;

import java.awt.print.Book;

class book{
    private String bookName;
    private String bookAuthor;
    private int bookEdition;
    private double bookPrice;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(int bookEdition) {
        this.bookEdition = bookEdition;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "( " + bookName + ", " + bookAuthor + ", " + bookEdition+ ", " + bookPrice + " )";
    }
}

public class BookStackADT {

    private book[] booksArray;
    private int top;

    public BookStackADT(int totalBooks)
    {
        booksArray = new book[totalBooks];
        top = -1;
    }

    void diaplay()
    {
        for (book book1 : booksArray) {
            if( book1 != null){
                System.out.println(book1);
            }
        }
    }

    public void push(book book1){
        if(top != booksArray.length-1){
            top++;
            booksArray[top] = book1;
        }
    }

    public book pop()
    {
        book temp = null;
        if(top != -1){
            temp = booksArray[top];
            top--;
        }
        return temp;
    }

    public static void main(String[] args) {
        BookStackADT stack = new BookStackADT(5);
        book book1 = new book();
        book1.setBookAuthor("DB");
        book1.setBookEdition(2);
        book1.setBookPrice(200);
        book1.setBookName("DataStructure");
        stack.push(book1);
        stack.diaplay();
        System.out.println(stack.pop() + " is removed");
    }

}
