//// 2) Реализуйте алгоритм сортировки пузырьком числового
//// массива, результат после каждой итерации запишите в лог-файл.*/

import java.io.*;
import java.sql.Timestamp;
import java.util.Scanner;

class ArrayBubble {
    private int[] a; // ссылка на массив
    private int elems; // количество элементов в массиве

    public ArrayBubble(int max) { // конструктор класса
        a = new int[max]; // создание массива размером max
        elems = 0; // при создании массив содержит 0 элементов
    }

    public void into(int value) { // метод вставки элемента в массив
        a[elems] = value; // вставка value в массив a
        elems++; // размер массива увеличивается
    }

    public void printer() {

        // метод вывода массива в консоль
        // OutputStream output = new FileOutputStream("file.txt"); // Создание
        // текстового файла
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < elems; i++) { // для каждого элемента в массиве

            System.out.print(a[i] + " "); // вывести в консоль
            //int a = scanner.nextInt();
            //logStep("User entered the first operand = " + a);
            // output.write((a[i])); // Запись каждого элемента в текстовый файл
            System.out.println(""); // с новой строки
        }
        System.out.println("----Окончание вывода массива----");
        // output.close();
    }

    private void toSwap(int first, int second) { // метод меняет местами пару чисел массива
        int dummy = a[first]; // во временную переменную помещаем первый элемент
        a[first] = a[second]; // на место первого ставим второй элемент
        a[second] = dummy; // вместо второго элемента пишем первый из временной памяти
    }

    public void bubbleSorter() { // МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--) { // Внешний цикл
            for (int in = 0; in < out; in++) { // Внутренний цикл
                if (a[in] > a[in + 1]) // Если порядок элементов нарушен
                    toSwap(in, in + 1); // вызвать метод, меняющий местами
            }
        }
    }
}

public class dz22 {
    public static File log;
    public static FileWriter fileWriter;

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }

    public static void main(String[] args) {
        try {
            log = new File("log.txt"); // создание лог файла
            log.createNewFile();
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ArrayBubble array = new ArrayBubble(5); // Создаем массив array на 5 элементов

        array.into(163); // заполняем массив
        array.into(300);
        array.into(184);
        array.into(191);
        array.into(174);

        array.printer(); // выводим элементы до сортировки
        array.bubbleSorter(); // ИСПОЛЬЗУЕМ ПУЗЫРЬКОВУЮ СОРТИРОВКУ
        array.printer(); // снова выводим отсортированный йсписок
    }
}
