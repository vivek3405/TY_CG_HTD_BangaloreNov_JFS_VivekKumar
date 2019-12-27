package com.capgemini.dij;

import com.capgemini.dij.dao.Animal;
import com.capgemini.dij.factory.AnimalFactory;

public class App {

	public static void main(String[] args) {
		Animal animal=AnimalFactory.getAnimal();

		animal.makeSound();
	}

}
