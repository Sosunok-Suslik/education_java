package lesson02.part01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Выведи на экран таблицу умножения 10 на 10 в следующем виде:
 * 1 2 3 4 …
 * 2 4 6 8 …
 * 3 6 9 12 …
 * 4 8 12 16 …
 * …
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 10 строк.
 * 3.	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
 * 4.	Выведенные числа должны быть таблицей умножения.
 */

public class Task13 {
    public static void main(String[] args) {
        int i,k=1;
        for (i=1;i<=10;i++){
            for (k=1;k<=10;k++){
                System.out.print(i*k+" ");
            }
            System.out.println(" ");
        }
    }
}
