package ru.gb.java;

public class Dog extends Animal implements Sound, ToEat, Move {
    String breed;

    public Dog(String name, int age, String color, String breed) {

        super(name, age, color);
        this.breed = breed;
    }

    public void soundVoice() {
        System.out.println("Гав-гав");
    }

    public void ToEat(float amountOfFood) {
        System.out.println("Собака " + super.getName()+ " съела " + amountOfFood + " кг мяса.");
    }
    public void Move() {
        System.out.println("Собака " + super.getName() + " виляет хвостом и бегает.");
    }
}
