package exercise3.com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	@Around("execution(* exercise3.com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Starting: " + joinPoint.getSignature());

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("Completed: " + joinPoint.getSignature() + " in " + (end - start) + " ms");
        return result;
    }
}
