package ru.gb.java;

public class Petuh extends Animal implements Sound, ToEat, Move {
    public Petuh(String name, int age, String color) {
        super(name, age, color);

    }

    public void soundVoice() {
        System.out.println("Кукареку");
    }

    public void ToEat(float amountOfFood) {
        System.out.println("Петух " + super.getName()+ " склевал " + amountOfFood + " грамм корма.");    }

    public void Move() {
        System.out.println("Петух " + super.getName() + " взлетел на забор.");
    }
}

