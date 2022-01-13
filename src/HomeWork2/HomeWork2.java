package HomeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
// сравение чисел
        System.out.println("Введите два целых числа для проверки," +
                " что их сумма лежит в пределах от 10 до 20 (включительно)");
        if (range(getNumb(),getNumb()) == true) {
            System.out.println("True Сумма чисел лежит в пределах от 10 до 20");
        } else {
            System.out.println("True Сумма чисел не лежит в пределах от 10 до 20");
        }

// Определение положительности чисел
        System.out.println( "\nВведите число для определения положительное ли число или отрицательное ");
        norpNumb(getNumb());
// Определение положительности чисел возвращает True or False
        if(norpNumbTF(getNumb()) == true){
            System.out.println("true");
        } else {
            System.out.println("False");
        }
// Выводит текст в консоль n раз
        System.out.println("\nВведите текст и количество раз для его вывода");
        printWord(getStrings(),getNumb());
        System.out.println("\nВаш текст");
//опеределяет високосный ли год
        System.out.println("Введите нужный год для определения високосный он или обычный");
        isYear(getNumb());


    }
    //Метод для считывания введенных чисел
    public static int getNumb(){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        return a;
    }
    //метод для считывания введенных строк
    public static String getStrings(){
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        return a;
    }
// метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
// от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

    public static boolean range(int a ,int b) {
        int c = a + b;
        System.out.println( "Сумма чисел = " + c );
        if ( c > 10 & c <= 20 ){
            System.out.println("true");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
//        return c>10 & c<=20;
    }
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом
    public static void norpNumb(int a) {
        if ( a >= 0  ){
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательное");

        }
    }
    //метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean norpNumbTF(int a) {
        return -a >=0;
    }
    //метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWord(String a,int n){
        for (int i = 1; i < n; i++){
            System.out.print(" " + a);
        }
    }
    //метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isYear(int a){
        if (a % 400 == 0 ){
            System.out.println(a +" - год високосный1");
            System.out.println("True");
            return true;
        } else if (a % 100 == 0){
            System.out.println(a +" - год не високосный2");
            System.out.println("False");
            return false;
        } else if (a % 4 == 0) {
            System.out.println(a +" - год високосный3");
            System.out.println("True");
            return true;
        } else {
            System.out.println(a +" - год не високосный4");
            System.out.println("False");
            return false;
        }

    }

}//конец класса
