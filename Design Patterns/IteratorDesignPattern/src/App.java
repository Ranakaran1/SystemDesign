import java.util.Arrays;

import java.util.List;

import entities.Book;
import entities.Iterator;
import entities.Library;

public class App {
    public static void main(String[] args) throws Exception {

        //not pushed
        List<Book> bookList = Arrays.asList(new Book(1000,"book1"),new Book(1001,"book2"),new Book(1003,"book3"));
        Library library = new Library(bookList);
        Iterator iterator = library.createIterator();


        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getBookName());
            
        }
    }
}
