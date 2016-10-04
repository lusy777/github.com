package lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        System.out.print("Please, input number of person:  ");
        Scanner scanner = new Scanner(System.in);
        int countPerson = scanner.nextInt();

        Person[] arrPerson = new Person[countPerson];
        for (int i = 0; i < countPerson; i++) {
            System.out.println("Please, select: \"1\"- Student, \"2\"-Employee, \"3\"-Pensioner.");
            System.out.print(">>  ");
            int type = scanner.nextInt();
            arrPerson[i] = Person.select(type);
        }
        Double min = arrPerson[0].getWeight();
        int j = 0;
        for (int i = 1; i < countPerson; i++) {
            if (arrPerson[i].getWeight() < min) {
                min = arrPerson[i].getWeight();
                j = i;
            }
        }
        System.out.println(arrPerson[j]);
    }
}

