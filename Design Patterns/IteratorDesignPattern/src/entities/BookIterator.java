package entities;

import java.util.List;

public class BookIterator implements Iterator {

    List<Book> listBook;
    private int index =0;

    public BookIterator(List<Book> listBook) {
        this.listBook = listBook;
    }

    @Override
    public boolean hasNext(){
        return index<listBook.size();
    }

    @Override
    public Object next() {
       if(this.hasNext()){
        return listBook.get(index++);
       }
       return null;
    }
    

    
}
