package ru.gb.java;

public class Fish extends Animal implements Sound, ToEat, Move {
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    public void soundVoice() {
        System.out.println("Буль-буль");
    }

    public void ToEat(float amountOfFood) {
        System.out.println("Рыбка " + super.getName() + " сьела " + amountOfFood + " грамм корма.");
    }
    public void Move() {
        System.out.println("Рыбка " + super.getName() + " весело плавает и пускает пузыри.");
    }
}


