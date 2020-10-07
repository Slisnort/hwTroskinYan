package hw1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*
        Найти количество вхождений одной строки в другую.
                Например, строка "дом" встречается в строке
                "дом домик домой одомашненный" 4 раза
         */


        // сложнооооо


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int k = scanner.nextInt();
        String[] massiv = new String[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Введите элемент массива");
            massiv[i] = scanner.next();
        }
        System.out.println("Введите проверяемое слово");
        String z = scanner.next();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (massiv[i].startsWith(z)) {
                count ++;
            }
        }
        System.out.println(count);





    }
}
