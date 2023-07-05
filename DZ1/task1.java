package DZ1;

import java.util.Scanner;

/**
 * task1
 */
public class task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи");
            System.out.println("1 - Работа С именем");
            System.out.println("2 - Работа с массивом");
            System.out.println("3 - Работа со строками");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());
    
            if (no == 1) {
                printName();
            }
            else if (no == 2) {
                task2();
            }
            else if (no == 3) {
                String str = "Добро пожаловать";
                task3(str);
            }
            else if (no == 0) {
                f = false;
                System.out.println("Завершение работы");
            }
        }



    }


    public static void printName(){
        String name = scanner.nextLine();
        System.out.println("mARS " + name + " = 10");
    } 

    public static void task2(){
        int max = 0;
        int counter = 0;
        int[]  array = {1,0,0,1,1,1,1,0,0,1,1,1,1,1};
        for (int e : array) {
            if (e == 1) {
                counter++;
                if (counter > max){
                    max = counter;
                }
            }
            else{
                counter = 0;
            }

        }
        //System.out.println("dfd");
        System.out.printf("Максимальное количество подряд идущих единиц: %d\n", max);


    }

    public static void task3(String str){
        String[] words = str.split(" ");
            for (int i = words.length-1; i >= 0 ; i--) {
                System.out.printf("%s \n", words[i]);
            }

    }

}