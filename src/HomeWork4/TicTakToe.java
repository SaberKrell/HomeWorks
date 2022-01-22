package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {


    final static int length = 3;
    final static String[][] field = new String[length][length];
    final static String empty = " * ";
    final static String cross = " X ";
    final static String zero = " O ";
    final static Scanner sc = new Scanner(System.in);
    final static Random rand = new Random();
    public static String checkSimb;
    static int X,Y;

    public static void main(String[] args) {
        // write your code here
        initMap();
        printMap();
        while (true) {
            playerMove();
            printMap();
            if (checkWinner(checkSimb)){
                System.out.println("Победила человека");
                break;
            }
            if (isEmptyField()){
                System.out.println("Ничья");
                break;
            }
            iiMove();
            printMap();
            if (checkWinner(checkSimb)){
                System.out.println("Победил ИИ рандом");
                break;
            }
            if (isEmptyField()){
                System.out.println("Ничья");
                break;
            }
        }
    }//main end
    // проверка на победную комбинацию
    private static boolean checkWinner(String checkSimb) {
        return checkWinnerHorizontal() ||
                checkWinnerVertical() ||
                checkWinnerDiagonals();
    }

    private static boolean checkWinnerHorizontal() {
        for (int i = 0; i < length; i++) {
            boolean res = true;
            for (int j = 1; j < length&&res; j++)
                res = (field[i][j] == field[i][0] && field[i][j] == checkSimb);
            if (res)
                return true;
        }
        return false;
    }


    private static boolean checkWinnerVertical() {
        for (int i = 0; i < length; i++) {
            boolean res = true;
            for (int j = 1; j < length&&res; j++)
                res = ((field[j][i] == field[0][i]) && (field[j][i] == checkSimb));
            if (res)
                return true;
        }
        return false;
    }

    private static boolean checkWinnerDiagonals() {
        boolean res = true;
        for (int i = 1; i < length&&res; i++)
            res = (field[i][i] == field[0][0] && field[i][i] == checkSimb);
        if (res)
            return true;
        res = true;
        for (int i = 1; i < length&&res; i++)
            res = (field[length - i - 1][i] == field[length - 1][0]
                    && field[length - i - 1][i] == checkSimb);
        return res;
    }
    //проверка заполненности поля X O
    private static boolean isEmptyField() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (field[i][j] == empty) return false;
            }
        }
        return true;
    }
    // ход компьютера
    public static void iiMove() {
        int x;
        int y;
        System.out.println("Ходит ИИ Рандом");

        do{
            x = rand.nextInt(length);
            y = rand.nextInt(length);
        } while (isNotValid(x, y));
        iiBlock(x,y);
        checkSimb =zero;
    }
    //логика ИИ 1.0
    private static void iiBlock(int x,int y) {
        for (int i = 0; i < length; i++) {

            if      ( field[i][0] == cross && field[i][1] == cross && field[i][2] == empty ) {field[i][2] = zero;break;}
            else if ( field[i][0] == cross && field[i][2] == cross && field[i][1] == empty ) {field[i][1] = zero;break;}
            else if ( field[i][1] == cross && field[i][2] == cross && field[i][0] == empty ) {field[i][0] = zero;break;}
            else if ( field[i][1] == cross && field[i][1] == cross && field[i][2] == empty ) {field[i][2] = zero;break;}
            else if ( field[i][2] == cross && field[i][1] == cross && field[i][0] == empty ) {field[i][0] = zero;break;}
            else if ( field[i][2] == cross && field[i][0] == cross && field[i][1] == empty ) {field[i][1] = zero;break;}

            else if ( field[0][i] == cross && field[1][i] == cross && field[2][i] == empty ) {field[2][i] = zero;break;}
            else if ( field[0][i] == cross && field[2][i] == cross && field[1][i] == empty ) {field[1][i] = zero;break;}
            else if ( field[1][i] == cross && field[2][i] == cross && field[0][i] == empty ) {field[0][i] = zero;break;}
            else if ( field[1][i] == cross && field[1][i] == cross && field[2][i] == empty ) {field[2][i] = zero;break;}
            else if ( field[2][i] == cross && field[1][i] == cross && field[0][i] == empty ) {field[0][i] = zero;break;}
            else if ( field[2][i] == cross && field[0][i] == cross && field[1][i] == empty ) {field[1][i] = zero;break;}

            else if (field[0][0] == cross && field[1][1] == cross && field[2][2] == empty) {field[2][2] = zero;break;}
            else if (field[0][0] == cross && field[2][2] == cross && field[1][1] == empty) {field[1][1] = zero;break;}
            else if (field[1][1] == cross && field[2][2] == cross && field[0][0] == empty) {field[0][0] = zero;break;}
            else if (field[1][1] == cross && field[0][0] == cross && field[2][2] == empty) {field[2][2] = zero;break;}
            else if (field[2][2] == cross && field[1][1] == cross && field[0][0] == empty) {field[0][0] = zero;break;}
            else if (field[2][2] == cross && field[0][0] == cross && field[1][1] == empty) {field[1][1] = zero;break;}

            else if (field[0][2] == cross && field[1][1] == cross && field[2][0] == empty) {field[2][0] = zero;break;}
            else if (field[0][2] == cross && field[2][0] == cross && field[1][1] == empty) {field[1][1] = zero;break;}
            else if (field[1][1] == cross && field[2][0] == cross && field[0][2] == empty) {field[0][2] = zero;break;}
            else if (field[1][1] == cross && field[0][2] == cross && field[2][0] == empty) {field[2][0] = zero;break;}
            else if (field[2][0] == cross && field[1][1] == cross && field[0][2] == empty) {field[0][2] = zero;break;}
            else if (field[2][0] == cross && field[0][2] == cross && field[1][1] == empty) {field[1][1] = zero;break;}
            else if (i == 2)field[x][y] = zero;
        }

    }

    // ход человека
    private static void playerMove() {
        System.out.println("Ваш ход");
        int x;
        int y;
        do{
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        } while (isNotValid(x, y));
        X=x; Y=y;
        System.out.println("Вы сходили в точку x="+ (x+1) +" y="+ (y+1));
        field[x][y] = cross;
        checkSimb = cross;

    }

    private static boolean isNotValid(int x, int y) {
        return x < 0 || x >= length && y < 0 || y >= length || field[x][y] == zero || field[x][y] == cross;
    }
    //вывод карты в консоль
    private static void printMap() {
        System.out.print("      ");
        for (int i = 0; i < length; i++) {
            System.out.print(" y ");
        }
        System.out.println();
        System.out.print("      ");
        for (int i = 0; i < length; i++) {
            System.out.print(" "+ (i+1) + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(" X  " + (i+1) + " ");
            for (int j = 0; j < length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
    //инициализация карты
    private static void initMap() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                field[i][j] = empty;
            }
        }
    }
}//class end




