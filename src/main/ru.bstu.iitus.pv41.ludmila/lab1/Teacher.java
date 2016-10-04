package lab1;

import java.util.Scanner;

public class Teacher extends Employee {
    private String name;
    private Double weight;
    private int age;
    private int numCertif;

    public Teacher(String name, int age, Double weight, int numCertif) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numCertif = numCertif;
    }

    public Teacher() {
        init();
    }

    @Override
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        this.name = scanner.nextLine();
        System.out.print("weught: ");
        this.weight = scanner.nextDouble();
        System.out.print("age: ");
        this.age = scanner.nextInt();
        System.out.print("number of certificate:");
        this.numCertif = scanner.nextInt();
    }

    public static Person select1() {
        return new Teacher();
    }

    @Override
    // возвращается вес человека на текущий момент
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "The person (Teacher) with the lowest weight: " + name + ", " + age + " years, " + weight + " kg, № " + numCertif;
    }
}

