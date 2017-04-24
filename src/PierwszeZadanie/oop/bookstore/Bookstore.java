package PierwszeZadanie.oop.bookstore;

/**
 * Created by bartosz on 24.04.2017.
 */
public class Bookstore {

    public Book[] books;
    public int numberOfBooks;


    public Bookstore(){
        this.books = new Book[100];
        this.numberOfBooks = 0;
    }

    public boolean add(Book book){
        boolean valueToReturn = false;
        if(numberOfBooks < 100) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            valueToReturn = true;
        }
        return valueToReturn;

    }

    public void showBooks(){
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public int getNumberOfBooks(String author) {
        int counter = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].author.equals(author)) {
                counter++;
            }

        }
        return counter;
    }


    public Book[] getBooks(String author) {
        Book[] bookToReturn = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].author.equals(author)) {
                bookToReturn[index] = books[i];
                index++;
            }
        }
        return bookToReturn;
    }

    public Book getBook(String author){
        return null;
    }





}
