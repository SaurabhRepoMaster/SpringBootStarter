package com.demo.demoProject.model;

import jakarta.persistence.*;

@Entity
public class Person {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int rollNumber;

    private String name;

    private String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
