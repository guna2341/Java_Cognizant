package com.library;


import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args )
    {
//        Exercise 8 - spring aop
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = context.getBean("bookService", BookService.class);
        service.getData();
        service.saveData();
    }
}
