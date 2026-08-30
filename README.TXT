# Java RPG Character System

A console-based Java project created to practice core Java programming and object-oriented programming concepts.

The program models different RPG character types using a shared parent class and specialized subclasses. Characters can attack, take damage, heal, and be analyzed using array-based utility methods.

## Features

* Multiple RPG character types, including Warriors and Mages
* Shared character properties such as name, health, and level
* Character-specific properties such as strength and mana
* Different attack behavior for each character type
* Health and damage management
* Prevention of health dropping below zero
* Character searching by name with case-insensitive comparison
* Finding the character with the highest health
* Counting characters above a specified health value
* Reversing character names
* Managing multiple character types in a single array

## Java Concepts Practiced

This project demonstrates:

* Classes and objects
* Constructors
* Encapsulation
* Private fields and getters
* Inheritance
* Method overriding
* Polymorphism
* `this`
* `super`
* Arrays
* Enhanced for loops
* Standard for loops
* Methods and return values
* Conditionals
* String manipulation
* Case-insensitive String comparison

## Project Structure

### `GameCharacter.java`

The parent class for all game characters.

Stores shared information such as:

* Name
* Health
* Level

It also contains shared behavior including attacking, taking damage, and healing.

### `Warrior.java`

A subclass of `GameCharacter`.

Adds a strength attribute and overrides the attack method with Warrior-specific behavior.

### `Mage.java`

A subclass of `GameCharacter`.

Adds a mana attribute and overrides the attack method with Mage-specific behavior.

### `Main.java`

Creates and stores character objects and demonstrates the project's functionality.

It also contains methods for:

* Finding a character by name
* Finding the character with the highest health
* Counting characters above a health threshold
* Reversing a character name

## Running the Project

Make sure Java is installed.

Compile the Java files:

```bash
javac *.java
```

Run the program:

```bash
java Main
```

## Purpose

This project was built as a learning project while studying Java and object-oriented programming. Its purpose is to practice combining individual programming concepts into a multi-class application rather than following a step-by-step project tutorial.

## Future Improvements

As I learn additional Java concepts, possible improvements include:

* Replacing the fixed character array with an `ArrayList`
* Adding additional character types
* Adding more character behaviors
* Improving input validation
* Adding automated tests
* Saving and loading character data
