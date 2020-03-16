package ru.geekbrains_lesson_3;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] Args) {

        Workers worker1 = new Workers("Григорьев", "слесарь", 1980, 23000);
        Workers worker2 = new Workers("Калинина", "бухгалтер", 1967, 80000);
        Workers worker3 = new Workers("Иванов", "газонокосильщик", 1990, 22000);
        Workers worker4 = new Workers("Панкратов", "прораб", 1969, 75000);
        Workers worker5 = new Workers("Ленина", "дизайнер", 1980, 60000);

        Object[] workerList = new String[5];
        workerList[0] = worker1;
        workerList[1] = worker2;
        workerList[2] = worker3;
        workerList[3] = worker4;
        workerList[4] = worker5;


        System.out.println(worker1.getAge());
        System.out.println(worker1.getPosition());
        System.out.println(worker2.getAge());
        System.out.println(worker2.getPosition());
        System.out.println(worker3.getAge());
        System.out.println(worker3.getPosition());
        System.out.println(worker4.getAge());
        System.out.println(worker4.getPosition());
        System.out.println(worker5.getAge());
        System.out.println(worker5.getPosition());


        for (int i = 0; i < workerList.length; i++) {
            if (Workers.getAge() < 40) {
                System.out.println(Workers.getLastName());
            }
        }

        for (int i = 0; i < workerList.length; i++) {
            if (Workers.getAge() > 45) {
                Workers.upSalary();
            } else continue;
        }
    
            for (int j = 0; j < workerList.length; j++) {
                Workers.averageSalary();
            }

        }
    }





