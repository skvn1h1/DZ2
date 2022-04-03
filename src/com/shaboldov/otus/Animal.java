package com.shaboldov.otus;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

//    public Animal(String name, int age, int weight, String color) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.color = color;
//    }

    private String leta(){
        String leta;
        if (age == 11 || age == 12 || age == 13 || age == 14)
            leta = "лет";
        else if ((age % 10) == 1)
            leta = "год";
        else if ((age % 10) <= 4 && (age % 10) > 0)
            leta = "года";
        else
            leta = "лет";
        return leta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        } else {
            System.out.println("Возраст меньше 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0){
            this.weight = weight;
        } else {
            System.out.println("Вес меньше 0");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }





    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ", мне " + age + " " + leta() +
                ", я вешу - " + weight + " кг" +
                ", мой цвет - " + color ;
    }

}
