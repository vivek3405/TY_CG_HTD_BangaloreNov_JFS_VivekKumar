package com.capgemini.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Cat;
import com.capgemini.springcore.beans.Dog;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

@Configuration //use instead of beans.xml ....same as beans.xml
public class BeansConfig {
	
	@Bean("hello")
	@Scope("prototype")//by default scope is singletone
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMessage("I love Siri");
		hello.setCount(1000);
		
		return hello;
	}
	@Bean(name="dog")//by default method name is name of the bean;
	public Dog getDog() {
		
		return new Dog();
	
	}
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean("pet")
	Pet getPet() {
		Pet pet=new Pet();
		pet.setName("tuffy");
		//pet.setAnimal(getDog()); for autowired
		return pet;
	}

}
