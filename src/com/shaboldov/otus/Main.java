package com.shaboldov.otus;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        Emenu menu;
        while (true){
            System.out.println("Выберите команду add/list/exit");
            menu = Emenu.valueOf(console.next().toUpperCase(Locale.ROOT).trim());

            switch (menu) {
                case ADD:
                    System.out.println("Выбери животное (cat/dog/duck)");
                    String animalType = console.next().toLowerCase(Locale.ROOT).trim();
                    Animal animal = null;
                    if (animalType.equals("cat")){
                        animal = new Cat();
                        animalGen(animal, console);
                    }
                    else if (animalType.equals("dog")){
                        animal = new Dog();
                        animalGen(animal, console);
                    }
                    else if (animalType.equals("duck")){
                        animal = new Duck();
                        animalGen(animal, console);
                    }
                    listOfAnimals.add(animal);
                    animal.say();
                    break;
                case LIST:
                    for (Animal a: listOfAnimals) {
                        System.out.println(a);
                    }
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }
    private static void animalGen(Animal animal, Scanner scanner){
        System.out.println("Введи имя");
        animal.setName(scanner.next());
        System.out.println("Введи возраст");
        animal.setAge(scanner.nextInt());
        System.out.println("Введи вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введи цвет");
        animal.setColor(scanner.next());
    }
}