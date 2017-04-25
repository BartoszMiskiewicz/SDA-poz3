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


    public Book[] getBooks(String author) {//przechodzimy po wszystkich ksiazkach
        Book[] bookToReturn = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {//i wybieramy odpowiedniego autora
            if (books[i].author.equals(author)) {// do tablicy ladujemy ksiazki te ktorych szukamy w progrmanie Application
                bookToReturn[index] = books[i];
                index++;
            }
        }
        return bookToReturn;//zwracamy wyszukana ksiazke
    }

    public Book getBook(String ISBN){//granuralne osobne rzeczy
        Book book = null;
        int i = 0;
        while (i < this.numberOfBooks && book == null){
           if (books[i].ISBN.equals(ISBN)){
               book = books[i];
           }
           //book = books[i]
           i++;
        }
        return book;
    }





}
