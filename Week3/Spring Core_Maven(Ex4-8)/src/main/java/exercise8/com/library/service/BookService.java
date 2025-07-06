package exercise8.com.library.service;

import exercise8.com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;
	private String repositoryName;
	
	public BookService(String repositoryName) {
        this.repositoryName = repositoryName;
    }
	
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
    	System.out.println("BookService using repository name: " + repositoryName);
        System.out.println("Adding book");
        bookRepository.saveBook();
    }
}
