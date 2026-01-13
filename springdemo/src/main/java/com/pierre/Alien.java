package com.pierre;

public class Alien {

    private int age;

    private Laptop laptop;


    

    public Alien() {
        System.out.println("Alien Object Created..");

    }



    public void code() {

        System.out.println("Im Coding..");
        laptop.compile();

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        System.out.println("age assignedaha");
        this.age = age;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


}
