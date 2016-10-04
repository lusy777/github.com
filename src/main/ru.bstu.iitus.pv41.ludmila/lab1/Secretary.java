package lab1;

import java.util.Scanner;

public class Secretary extends Employee {
    private String name;
    private Double weight;
    private int age;
    private int empID;

    public Secretary(String name, int age, Double weight, int empID) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.empID = empID;
    }

    public Secretary() {
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
        System.out.print("id:  ");
        this.empID = scanner.nextInt();
    }

    @Override
    // возвращается вес человека на текущий момент
    public Double getWeight() {
        return this.weight;
    }

    public static Person select1() {
        return new Secretary();
    }

    @Override
    public String toString() {
        return "The person (Secretary) with the lowest weight: " + name + ", " + age + " years, " + weight + " kg, № " + empID;
    }

}
