package exercise6.com.library.service;

import exercise6.com.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService {
	private BookRepository bookRepository;

	@Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Adding book");
        bookRepository.saveBook();
    }
}
