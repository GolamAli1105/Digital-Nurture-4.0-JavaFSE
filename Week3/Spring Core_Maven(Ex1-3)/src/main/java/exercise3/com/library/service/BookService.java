package exercise3.com.library.service;

import exercise3.com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
        
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
        
    public void addBook() {
       	System.out.println("Adding book");
    	bookRepository.saveBook();
    }
}
