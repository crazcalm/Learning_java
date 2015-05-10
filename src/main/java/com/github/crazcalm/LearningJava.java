package com.github.crazcalm;

public class LearningJava {
    public static void main(String[] args){
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        Person marcus = new Person(name, age);

        toScreen(marcus);

    }

    private static void toScreen(Person person){
        System.out.print("My name is " + person.getName());
        System.out.print(" and I am " + Integer.toString(person.getAge()) + " years old");
    }
}
