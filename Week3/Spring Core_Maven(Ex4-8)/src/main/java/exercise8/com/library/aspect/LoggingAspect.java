package exercise8.com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {
	@Before("execution(* exercise8.com.library.service.*.*(..))")
    public void logBefore() {
        System.out.println("[LOG] Method execution starting");
    }

    @After("execution(* exercise8.com.library.service.*.*(..))")
    public void logAfter() {
        System.out.println("[LOG] Method execution completed");
    }
}
