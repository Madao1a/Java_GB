package DZ;

import java.util.Scanner;

public class DZ1 {

/*Задание

1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2) Вывести все простые числа от 1 до 1000
 */


    public static void main(String[] args) {
        //task1();
        task2();
    }

    static void task1() {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        
    }

    static void task2() {
        boolean b = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.printf("%s ",i);
            else b = true;
            
        }
    }

}
