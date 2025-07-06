package exercise1.com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import exercise1.com.library.service.BookService;

public class LibraryManagementApplication {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exercise1/applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook();
    }
}
