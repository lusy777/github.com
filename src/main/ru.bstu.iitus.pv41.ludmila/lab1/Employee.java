package lab1;

import java.util.Scanner;

public abstract class Employee extends Person {

    public static final int teacher = 1;
    public static final int secretary = 2;

    public static Person select2() {
        System.out.println("Please, select: \"1\"- Teacher, \"2\"-Secretary.");
        System.out.print(">>  ");
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        switch (type) {
            case teacher:
                return Teacher.select1();
            case secretary:
                return Secretary.select1();
            default:
                throw new RuntimeException("Incorrect input!");
        }
    }

    public abstract Double getWeight();

    //считывание параметров с консоли
    public abstract void init();

    public abstract String toString();
}
