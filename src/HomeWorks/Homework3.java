package HomeWorks;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
//первое задание
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replace(array)));
//второе задание
        int[] array100 = new int[100];
        System.out.println(Arrays.toString(addarray(array100)));
//третье задание
        int[] array6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(multipy2(array6)));
//четвертое задание
        int[][] arrayXO = new int[10][10];
        diagonalarray(arrayXO);
//пятое задание
        int len = 5;
        int initialValue = 10;
        System.out.println(Arrays.toString(createArray(len,initialValue)));
//шестое задание
        minMax(array6);
//седьмое задание
        int[] array7 = {1, 2, 3, 4, 5, 6 };
        arraySumm(array7);
        System.out.println(arraySumm(array7) == true ? "true" : "false");
//восьмое задание

        int n = 1;
        offsetElements(n, array7);

    }//main end
// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0
    private static int[] replace(int [] array) {
        for (int i = 0; i < array.length; i++ )
            if (array[i] == 1){
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        return array;
    }
//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static int[] addarray(int[] array100) {
        for (int i = 0; i < array100.length; i++ ){
            array100[i] = i+1;
        }
            return array100;
    }
// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static int[] multipy2(int[] array6) {
        for (int i = 0; i < array6.length; i++ ){
            if(array6[i] < 6){
               array6[i] *= 2;
            }
        }
        return array6;
    }
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
// элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static int[][] diagonalarray(int[][] arrayXO) {
        for (int i = 0; i < arrayXO.length; i++ ){
            for (int j = 0; j < arrayXO.length; j++ ){
                if (arrayXO[i] == arrayXO[j]){
                    arrayXO[i][j] = 1;
                }   else {
                    arrayXO[i][j] = 0;
                }
                System.out.print(" " + arrayXO[i][j] + " ");
            }
            System.out.println();
        }
        return arrayXO;
    }
// Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    private static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < newArray.length; i++ )
            newArray[i] = initialValue;
        return newArray;
    }
//* Задать одномерный массив и найти в нем минимальный и максимальный элементы
// или отсортировать и выдать 1 и последний элементы
    private static void minMax(int[] array) {
        int min = 1;
        int max = 1;
        for (int i = 0; i < array.length; i++ ){
            if(array[i] < min) {
              min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("минимальное число в массиве = " + min);
        System.out.println("максимальное число в массиве = " + max);
    }
//** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    private static boolean arraySumm(int[] array) {
        int summLeft = 0;
        int summRight = 0;
        if(array.length % 2 == 0){
            for (int i = 0; i < array.length/2; i++ ) {
                summLeft += array[i];
            }
            for (int j = array.length-1; j >= array.length/2; j--){
                summRight += array[j];
            }
        } else if (array.length % 2 != 0){
            System.out.println("Число значений в массиве нечетное");
        }
        return summLeft == summRight ? true : false;
    }
//Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
// при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
// int[] array7 = {1, 2, 3, 4, 5, 6 };
// Тут пока сложности в процессе доработки

    private static int[] offsetElements(int n ,int[] array) {
        int buffArray;
        int buffArray1 = array[n-1];
        int b = array.length-1;
        buffArray = array[array.length-1];
        while(b != n){
            array[b] = array[b-n];
            b--;
        }
        array[n] = buffArray1;
        array[n-1] = buffArray;
        return array;
    }

}//Homework3 end
