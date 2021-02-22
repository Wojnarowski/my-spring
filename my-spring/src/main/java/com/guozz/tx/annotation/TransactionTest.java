package com.guozz.tx.annotation;

import com.guozz.tx.annotation.config.TransactionConfig;
import com.guozz.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(TransactionConfig.class);
		applicationContext.refresh();
		BookService bean = applicationContext.getBean(BookService.class);
		bean.checkout("zhangsan",1);
	}

}
