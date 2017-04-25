package PierwszeZadanie.oop.bookstore;

/**
 * Created by bartosz on 24.04.2017. - konstuktor to troche metoda , fizycznie oznacza zalokowac dana w pamieci!!!!!!!
 */
public class Application {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        insertExampleDate(bookstore);
//        Book[] books = bookstore.getBooks("Henryk Sienkiewicz");//szukana ksiazka
//        for (int i = 0; i <books.length ; i++) {
//            System.out.println(books[i]);
//        }

        System.out.println(bookstore.getBook("223232"));
        System.out.println(bookstore.getBook("22323212"));

//        System.out.println(bookstore.books[0].toString());
//        bookstore.showBooks();// bo mamy regal w ktorym ustawilismy dane i daltego mozna robic show books




    }

    public static void insertExampleDate(Bookstore bookstore){
        Book book = new Book("Ogniem i Mieczem" , "Henryk Sienkiewicz" , "2001", "22323232");// konstruktor podaje nakazuje co mamy wpisac
        book.releaseDate = "2001";
        book.size = 3;
        String[] ogiemIMieczem = new String[3];
        ogiemIMieczem[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        ogiemIMieczem[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
        ogiemIMieczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ";
        book.content = ogiemIMieczem;

        Book book2 = new Book("Quo Vadis" , "Henryk Sienkiewicz" , "2002", "22323212");// konstruktor podaje nakazuje co mamy wpisac
        book.size = 3;
        String[] quoVadis = new String[3];
        quoVadis[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        quoVadis[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
        quoVadis[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ";
        book2.content = quoVadis;

        Book book3 = new Book("Dziady" , "Adam Mickiewicz" , "2004", "22323211");// konstruktor podaje nakazuje co mamy wpisac
        book.size = 3;
        String[] dziady = new String[3];
        dziady[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        dziady[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
        dziady[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ";
        book3.content = dziady;

        bookstore.add(book);
        bookstore.add(book2);
        bookstore.add(book3);

    }

}
