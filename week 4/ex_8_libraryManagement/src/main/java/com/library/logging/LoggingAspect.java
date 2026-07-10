package com.library.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library..*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing method: " + joinPoint.getSignature().toShortString());
    }

    @Around("execution(* com.library..*.*(..))")
    public Object executionTime(ProceedingJoinPoint joinPoint) {
        long start = System.nanoTime();
        try {
            return joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            long end = System.nanoTime();
            String timeMs = String.format("%.2f", (end - start) / 1_000_000.0);
            System.out.println(joinPoint.getSignature().toShortString() + " executed in " + timeMs + "ms");
        }
    }

    @After("execution(* com.library..*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().toShortString() + " method completed");
    }

}
