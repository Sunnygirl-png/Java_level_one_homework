package ru.geekbrains_lesson_3;

public class Workers {
    private static String lastName;
    private static int salary;
    private static int birthDate;
    public static final int CURRENT_YEAR = 2020;
    private String position;

    Workers() {
    }

    Workers(String lastName, String position, int Age, int Salary) {
        this.lastName = lastName;
        this.position = position;
        this.salary = getSalary();
        this.getAge();
    }

    public static String getLastName() {
        return lastName;
    }

    public static int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getAge() {
        return CURRENT_YEAR - birthDate;
    }

    public String getPosition() {
        return this.position;
    }

//метод, повышающий зарплату сотрудникам старше 45 лет
    public static int upSalary() {
        salary = getSalary() + 5000;
        return salary;
    }

// cредне-арифметическая з/п
    public static int averageSalary(){
        int sum =0;
        sum = (sum + getSalary())/5;
        return sum;
        }
    }





