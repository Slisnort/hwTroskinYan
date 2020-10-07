package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*
        Заполнить массив
        Задать массив на N слов.
        В цикле считывать с консоли слова (scanner.nextLine()),
        и добавлять их в массив (добавлять новое слово в массив можно
        только, если в нем его еще нет).
        В итоге в массиве будут только уникальные слова.
        Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
        Перед завершением программы, вывести получившийся массив в консоль
         */

        // не понимаю как решить :(

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int num = scanner.nextInt();
        String[] mass = new String[num];
        String k = "rat";
        int u = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Введите слово для добавления в массив");
            u++;
            for (int j = 0; j < u; j++) {
                k = scanner.next();
                if () {
                    mass[i] = k;
                }
            }

            if (mass[i] == "exit") {
                System.out.println("Завершение программы");
                break;
            }
        }
        System.out.println(Arrays.toString(mass));


    }
}
