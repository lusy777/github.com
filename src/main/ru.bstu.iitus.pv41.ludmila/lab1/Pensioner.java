package lab1;

import java.util.Scanner;

public class Pensioner extends Person {
    private String name;
    private Double weight;
    private int age;
    private int seniority;

    public Pensioner(String name, int age, Double weight, int empID, int seniority) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.seniority = seniority;  //трудовой стаж
    }

    public Pensioner() {
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
        System.out.print("seniority: ");
        this.seniority = scanner.nextInt();
    }

    public static Person select1() {
        return new Pensioner();
    }

    @Override
    // возвращается вес человека на текущий момент
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "The person (Pensioner) with the lowest weight: " + name + ", " + age + " years, " + weight + " kg, seniority : " + seniority + " years.";
    }
}


