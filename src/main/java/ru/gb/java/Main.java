package ru.gb.java;

//Нужно создать несколько классов животных:
//        1. Пес (Собака)+
//        2. Кот (Кошка)+
//        3. ... придумать еще парочку+
//
//        Каждое животное имеет: (поля)+
//        1. Имя (кличка)+
//        2. Возраст+
//        3. ... придумать еще какие-то параметры+
//
//        Каждое животное может: (методы)
//        1. Подавать голос+
//        2. Питаться (съедает какое-то количество еды, переданное в метод)+
//        3. Двигаться +
//
//        Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.

//        Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Cat cat = new Cat("Мурка", 2, "Черный", "Сфинкс");
        Dog dog = new Dog("Шарик", 5,"Коричневый", "Чихуа-Хуа");
        Fish fish = new Fish("Акванафт", 1,"Золотая");
        Petuh petuh = new Petuh("Петя", 6, "Пурпурный");

        ArrayList<Animal> zoo = new ArrayList<>();
        
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(fish);
        zoo.add(petuh);

        for (Animal animal : zoo) {

            if (animal instanceof Cat) {
                Cat cat1 = (Cat) animal;
                cat1.ToEat(1);
                cat1.Move();
            } else if (animal instanceof Dog) {
                Dog dog1 = (Dog) animal;
                dog1.ToEat(1);
                dog1.Move();
            } else if (animal instanceof Fish) {
                Fish fish1 = (Fish) animal;
                fish1.ToEat(1);
                fish1.Move();
            } else if (animal instanceof Petuh) {
                Petuh petuh1 = (Petuh) animal;
                petuh1.ToEat(1);
                petuh1.Move();
            }
        }
    }
}