package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*
        Написать функцию, которая проверяет, является ли строка палиндромом.
        Палиндром — это число, буквосочетание, слово или текст,
        которые одинаково читаются по буквам или по
        словам как слева направо, так и справа налево.
        Например, 202 - палиндром / fafaf - палиндром /
        а роза упала на лапу Азора - палиндром
         */


        // не работает, не понимаю где ошибка


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String slovo;
        slovo = scanner.next();
        String[] massiv = slovo.split("");
        int x = 0, y = massiv.length;
        for (int i = 0; i < massiv.length; i++) {
            if (x == y) {
                System.out.println("Слово " + slovo + " - палиндром");
                break;
            } else if (massiv[x] == massiv[y]) {
                x++;
                y--;
            } else {
                System.out.println("Слово " + slovo + " - не палиндром");
                break;
            }
        }



    }
}
