/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meth2;

/**
 *
 * @author user
 */
/**
 * This program illustrates a class hierarchy that models animals and, specifically, cats.
 * The `Animal` class serves as the base class representing an animal with a name.
 * The `Cat` class extends the `Animal` class to represent a specific type of animal - a cat.
 * The `Meth2` class contains the `main` method to showcase the usage of the classes.
 */
class Animal {
    String name;   // Holds the name of the animal

    /**
     * Constructs an `Animal` object with a given name.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Outputs a default "speech" message that represents the animal's sound or communication.
     * In this case, it always prints "my cat."
     */
    public void speak() {
        System.out.println("my cat.");
    }

    /**
     * Introduces the animal by printing its name.
     */
    public void introduce() {
        System.out.println("hang tuah " + name + ".");
    }
}

/**
 * The `Cat` class extends the `Animal` class to represent a specific type of animal - a cat.
 */
class Cat extends Animal {

    /**
     * Constructs a `Cat` object with a given name.
     *
     * @param name The name of the cat.
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Outputs a message indicating that the cat is making a meowing sound.
     */
    public void meow() {
        System.out.println("meow");
    }
}

/**
 * The `Meth2` class contains the `main` method to showcase the usage of the `Cat` class.
 */
public class Meth2 {
    public static void main(String[] args) {
        // Create a new Cat instance with the name "BSH"
        Cat cat = new Cat("BSH");
        
        // Introduce the cat by calling the introduce() method from the Animal class
        cat.introduce();
        
        // Make the cat meow using the specialized meow() method
        cat.meow();
    }
}

