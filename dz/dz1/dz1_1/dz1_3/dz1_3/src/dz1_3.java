
// Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;

public class dz1_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numb_a = sc.nextInt();
        // System.out.println("Введите операцию + - / *: ");
        // char operation;
        System.out.print("Введите второе число: ");
        int numb_b = sc.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char operation;
        operation = sc.next().charAt(0);
        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.printf("Результат: %d", res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.printf("Результат: %d", res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.printf("Результат: %d", res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.printf("Результат: %d", res);
                break;
        }
        sc.close();
    }
}