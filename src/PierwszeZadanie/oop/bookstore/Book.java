package PierwszeZadanie.oop.bookstore;

import java.util.Arrays;

/**
 * Created by bartosz on 24.04.2017.
 */
public class Book {//obiekt Book istnieje wtedy kiedy ma podane dane z konstuktora
    public String title;
    public String descripton;
    public String author;
    public String releaseDate;
    public int size;
    public String ISBN;
    public String[] content;

    public Book(String title, String author, String releaseDate, String ISBN){//konstuktor- metoda ktora jest wykorzystywana do tworzenia obiektow
        this.title = title;//konstuktora to metoda przytworzeniu obiektow - odwoluje sie do obiektu ktory zostal utworzony
        this.author = author;
        this.releaseDate = releaseDate;
        this.releaseDate = ISBN;
        this.descripton = "To be updated";


    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    //    public void printDescription(){
//        System.out.println(descripton);
//    }

}
