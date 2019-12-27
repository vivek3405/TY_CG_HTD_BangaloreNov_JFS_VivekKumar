package com.capgemini.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Book;
import com.capgemini.springcore.config.BeansConfig2;

public class AnnotationConfigBook {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig2.class);
		
		System.out.println("=======wiring and autowired============");
		Book book=context.getBean(Book.class);
		System.out.println(book.getName());
		book.getAuthor().write();
	}

}
