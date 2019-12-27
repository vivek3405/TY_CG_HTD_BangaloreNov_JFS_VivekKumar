package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Animal;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;
import com.capgemini.springcore.config.BeansConfig;

public class AnnotationConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Hello hello=context.getBean(Hello.class);
		
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());
		System.out.println("==========================");
		Hello hello2=context.getBean(Hello.class);
		System.out.println(hello2.getMessage());
		System.out.println(hello2.getCount());
		System.out.println("===================");
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println(hello==hello2);
		
		
		Animal animal=context.getBean(Animal.class);
		animal.makeSound();
		
		System.out.println("=======wiring and autowired============");
		Pet pet=context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
		
	}
}
