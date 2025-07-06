package exercise8.com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exercise8.com.library.service.BookService;

public class LibraryManagementApplication {
	public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("exercise8/applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");

        bookService.addBook();
    }
}
