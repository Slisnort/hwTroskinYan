package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
        Найдите самое длинное слово в предложении, при условии,
        что в предложении все слова разной длины
        Например, в "в предложении все слова разной длины"
        самое длинное слово "предложении"
         */


        // должно работать но не работает, вообще не понимаю почему


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String predlozenie;
        predlozenie = scanner.nextLine();
        String[] massiv = predlozenie.split(" ");
        String mainSlovo = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i].length() > massiv[i + 1].length()) {
                mainSlovo = massiv[i];
            }
            System.out.println(mainSlovo);
        }


    }
}
