package ArraysMyArrays;

import java.util.Arrays;
public class MyArrays {
//Задача 1
    public static int[] changeArray() {
        int[] firstArray = {1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 0) {
                firstArray[i] += 1;
            } else {
                firstArray[i] -= 1;
            }
        }
        return firstArray;
    }
//Задача 2
    public static int[] stepArray() {
        int[] secondArray = new int[8];
        secondArray[0]=1;
        for (int i = 1; i < secondArray.length; i++) {
            secondArray[i]=secondArray[i-1]+(secondArray[i]+3);
        }
            return secondArray;
        }
//Задача 3
        public static int[]multArray(){
        int[]thirdArray = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i<thirdArray.length; i++){
            if (thirdArray[i]<6){
                thirdArray[i]*=2;
            }else {
                thirdArray[i]=thirdArray[i];
            }
        }
            return thirdArray;
    }
//Задача 4
    public static int minArray() {
        int[] forthArray = {4, 2, 15, 6, 3};
        int minValue = forthArray[0];

        for (int i = 0; i < forthArray.length; i++) {
            if (forthArray[i] < minValue) {
                minValue = forthArray[i];
            }
        }
        return minValue;
    }
    public static int maxArray() {
        int[] forthArray = {4, 2, 15, 6, 3};
        int maxValue = forthArray[0];
        for (int i = 0; i < forthArray.length; i++) {
            if (forthArray[i] > maxValue) {
                maxValue = forthArray[i];
            }
        }
        return maxValue;
    }

    //Задача 5
    public static int quadrusArray() {
        int[][] quadArr = new int[5][5];
        for (int i = 0; i < quadArr.length; i++) {
            for (int j = 0; j < quadArr[j].length; j++) {
                if (i == j) {
                    quadArr[i][j] = 1;
                } else {
                    quadArr[i][j] = 0;
                }
            }
        }return quadrusArray();
    }



        public static void main(String[]args){
            changeArray();
            System.out.println(Arrays.toString(changeArray()));

            stepArray();
            System.out.println(Arrays.toString(stepArray()));

            multArray();
            System.out.println(Arrays.toString(multArray()));

            minArray();
            maxArray();
            System.out.println(minArray());
            System.out.println(maxArray());

            quadrusArray();
            System.out.println(quadrusArray());

        }
    }

