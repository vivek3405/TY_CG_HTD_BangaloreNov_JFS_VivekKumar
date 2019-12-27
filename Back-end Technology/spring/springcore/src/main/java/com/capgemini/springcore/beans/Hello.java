package com.capgemini.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello {//implements InitializingBean, DisposableBean {
	private String message;

	private int count;
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}

	public Hello() {
		System.out.println("object created");
	}

	public Hello(String message, int count) {
		this.message = message;
		this.count = count;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
/*	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesset");
	}
	*/

}
}
