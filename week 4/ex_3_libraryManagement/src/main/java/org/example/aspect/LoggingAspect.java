package org.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class LoggingAspect {

    @Before("execution(* org.example.service.*.*(..))")
    public void logBefore() {
        System.out.println("Method started");
    }

    @Around("execution(* org.example.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        try {
            return joinPoint.proceed();
        }
        finally {
            long end = System.nanoTime();

            double time = (end-start) / 1_000_000.0;

            System.out.printf("%s executed in %.3f ms\n", joinPoint.getSignature().toShortString(), time);
            System.out.println("Method ended");
        }
    }
}
