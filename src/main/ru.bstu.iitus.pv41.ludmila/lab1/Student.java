package lab1;

import java.util.Scanner;

public class Student extends Person {
    private String name;
    private Double weight;
    private int age;
    private int numZBook;

    public Student(String name, int age, Double weight, int numZBook) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numZBook = numZBook;
    }

    public Student() {
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
        System.out.print("number of the record book: ");
        this.numZBook = scanner.nextInt();
    }

    public static Person select1() {
        return new Student();
    }

    @Override
    // возвращается вес человека на текущий момент
    public Double getWeight() {

        return this.weight;
    }

    //(определяется только в наследниках, т.к. определен в Object)
    public String toString() {
        return "The person (Student) with the lowest weight: " + name + ", " + age + " years, " + weight + " kg, № " + numZBook;
    }


}
