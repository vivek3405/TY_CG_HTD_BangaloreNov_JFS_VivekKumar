package com.capgemini.dij.factory;

import com.capgemini.dij.dao.Animal;
import com.capgemini.dij.dao.Dog;

public class AnimalFactory {
	private AnimalFactory() {}

	public static Animal getAnimal() {
		return new Dog();

	}

}
