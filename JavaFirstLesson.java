package ru.geekbrains.java.first_lesson;


public class JavaFirstLesson {

    public double calcMethod(int a,int b, int c, int d){
        double result = a * (b + (c / d));
        return result;
    }

    boolean isTrue = true;

    public boolean sumResult(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return isTrue;
        } else {
            return false;
        }

    }
    public boolean equalResult(int c){
        if (c>=0){
            return isTrue;
        }else{
            return false;
        }

    }
    public String name(String name){
        return("Привет, " + name + "!");
    }

    public static void main(String[] args) {
        JavaFirstLesson calcResult = new JavaFirstLesson();
        calcResult.calcMethod(2, 1, 5, 2);
        System.out.println(calcResult.calcMethod(2,1,5,2));

        calcResult.sumResult(2, 1);
        System.out.println(calcResult.sumResult(2,1));

        calcResult.equalResult(1);
        System.out.println(calcResult.equalResult(1));

        System.out.println(calcResult.name("Иван"));
    }
}


