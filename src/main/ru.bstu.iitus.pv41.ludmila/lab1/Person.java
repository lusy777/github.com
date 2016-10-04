package lab1;

abstract public class Person {
    public Double weight;
    public static final int student = 1;
    public static final int employee = 2;
    public static final int pensioner = 3;

    public static Person select(int type) {
        switch (type) {
            case student: {
                return Student.select1();
            }
            case employee: {
                return Employee.select2();
            }
            case pensioner: {
                return Pensioner.select1();
            }
            default: {
                throw new RuntimeException("Incorrect input!");
            }
        }
    }

    //считывание параметров с консоли
    public abstract void init();

    // возвращается вес человека на текущий момент
    public abstract Double getWeight();

    public abstract String toString();


}
