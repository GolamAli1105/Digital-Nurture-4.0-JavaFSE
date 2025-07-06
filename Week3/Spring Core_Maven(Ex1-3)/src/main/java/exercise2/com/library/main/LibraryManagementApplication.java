package exercise2.com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import exercise2.com.library.service.BookService;

public class LibraryManagementApplication {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exercise2/applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook();
    }
}
