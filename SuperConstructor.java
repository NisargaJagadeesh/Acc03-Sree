package com.tnsif.polymorphism;
public class MethodOverloading {

    // Method with one integer
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Method with two integers
    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with a String
    void display(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.display(10);
        obj.display(10, 20);
        obj.display("Nisarga");
    }
}