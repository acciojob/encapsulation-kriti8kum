package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly(); // Create an object of RWOnly

        // Try setting a value directly (will result in an error)
        // obj.name = "John"; // Uncommenting this line will cause an error

        // Set the value using the setter method
        obj.setName("John");

        // Access the value using the getter method
        String retrievedName = obj.getName();
        System.out.println("Name retrieved from RWOnly object: " + retrievedName);
    }
}
