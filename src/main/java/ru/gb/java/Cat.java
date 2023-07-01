package ru.gb.java;

public class Cat extends Animal implements Sound, ToEat, Move {
    String breed;
    public Cat(String name, int age,String color, String breed) {

        super(name, age, color);
        this.breed = breed;
    }

    public void soundVoice() {
        System.out.println("Мяу-мяу");
    }

    public void ToEat(float amountOfFood) {
        System.out.println("Кошка " + super.getName()+ " съела " + amountOfFood + " грамм рыбы.");
    }
    public void Move() {
        System.out.println("Кошка " + super.getName() + " залезла на дерево.");
    }
}

