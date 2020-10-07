package hw1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
        Заменить все буквы в слове на строчные, а первую букву на заглавную
        Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
         */


        // хоть что то получилось


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String slovo1;
        slovo1 = scanner.next();
        String[] massiv = slovo1.split("");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = massiv[i].toLowerCase();
        }
        massiv[0] = massiv[0].toUpperCase();

        String slovo2 = String.join("", massiv);
        System.out.println(slovo2);
    }
}
