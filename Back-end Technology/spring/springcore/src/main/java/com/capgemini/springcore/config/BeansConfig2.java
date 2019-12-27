package com.capgemini.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.beans.AGentlemenInMoscow;
import com.capgemini.springcore.beans.Book;
import com.capgemini.springcore.beans.Pet;
import com.capgemini.springcore.beans.TheManWhoThoughtDifficult;
@Configuration
public class BeansConfig2 {
	@Bean("theMan")
	public TheManWhoThoughtDifficult getTheManWhoThoughtDifficult() {
		return new TheManWhoThoughtDifficult();
	}
	
	@Bean("AGentlemen")
	@Primary
	public AGentlemenInMoscow getAGentlemenInMoscow() {
		return new AGentlemenInMoscow();
	}
	@Bean("book")
	public Book getBook() {
		Book book=new Book();
		book.setName("fiction");
		return book;
		
	}

}
