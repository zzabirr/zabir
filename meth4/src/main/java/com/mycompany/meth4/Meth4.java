/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meth4;

/**
 *
 * @author user
 */
/**
 * This program demonstrates the use of classes to model animals and, specifically, cats.
 * The `Animal` class represents an animal with a name and an identification number.
 * The `Cat` class extends the `Animal` class to represent a specific type of animal - a cat.
 * The `Meth3` class contains the `main` method to showcase the usage of the classes.
 */
class Animal {
    String name;   // Stores the name of the animal
    int number;    // Holds an identification number for the animal

    /**
     * Constructs an `Animal` object with a given name and identification number.
     *
     * @param name   The name of the animal.
     * @param number The identification number of the animal.
     */
    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * Outputs a default "speech" message that represents the animal's sound or communication.
     * In this case, it always prints "my cat."
     */
    public void speak() {
        System.out.println("my cat");
    }

    /**
     * Introduces the animal by printing its name and identification number.
     */
    public void introduce() {
        System.out.println("hang tuah " + name + ", umur " + number + ".");
    }
}

/**
 * The `Cat` class extends the `Animal` class to represent a specific type of animal - a cat.
 */
class Cat extends Animal {

    /**
     * Constructs a `Cat` object with a given name and identification number.
     *
     * @param name   The name of the cat.
     * @param number The identification number of the cat.
     */
    public Cat(String name, int number) {
        super(name, number);
    }

    /**
     * Outputs a message indicating that the cat is meowing, typically due to hunger.
     */
    public void meow() {
        System.out.println("lapar");
    }
}

/**
 * The `Meth3` class contains the `main` method to showcase the usage of the `Cat` class.
 * It handles potential exceptions that may arise during execution.
 */
public class Meth4 {
    public static void main(String[] args) {
        try {
            // Create a new Cat instance with the name "BSH" and identification number 3
            Cat cat = new Cat("BSH", 3);
            
            // Introduce the cat by calling the introduce() method from the Animal class
            cat.introduce();
            
            // Make the cat meow using the specialized meow() method
            cat.meow();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

