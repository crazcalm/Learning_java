package com.github.crazcalm.LearnInterfaces;

/**
 * Created by marcuswillock on 5/18/15.
 */
public class Person implements Human {

    private String name = "";
    private int age = -1;

    public static void main(String[] args){

        Person marcus = new Person();
        marcus.setAge(27);
        marcus.setName("Marcus");
        System.out.println(marcus.getAge());
        System.out.println(marcus.getName());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        if (this.name.equals("")){
            return "I have no name";
        }
        else {
            return this.name;
        }
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
