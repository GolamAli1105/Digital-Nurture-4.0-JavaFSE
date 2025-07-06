package exercise2.com.library.service;

import exercise2.com.library.repository.BookRepository;

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
