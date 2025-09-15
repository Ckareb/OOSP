/*
Задание 5: Циклы в Java
Основное задание:
Вывести числа от 1 до 10 с помощью цикла for.
Считать сумму чисел от 1 до 100 с помощью while.
Запрашивать пароль до тех пор, пока он не будет введён правильно — с помощью do-while.
Дополнительная задача: Подсчитайте факториал числа 5 с помощью while.
* */
package WorkFive;

import java.util.Scanner;

public class WorkFive {
    private int maxStep = 10;
    private int sum;
    private String password;
    private int factorial;
    private int resultFactorial = 1;

    public void cycleFOR(){
        System.out.println("Числа от 1 до 10 с помощью for:");
        for (int i = 0; i < maxStep; i++){
            System.out.println(i + 1);
        }
    }

    public void cycleWhile(){
        System.out.println("Сумма чисел от 1 до 100 с помощью while:");
        while (sum < 100){
            sum += 1;
        }
        System.out.println(sum);
    }

    public void factorial(){
        System.out.println("Введите факториал числа:");
        Scanner sc = new Scanner(System.in);
        factorial = sc.nextInt();

        int i = 1;
        while (i <= factorial){
            resultFactorial *= i;
            i++;
        }

        System.out.println(resultFactorial);
    }

    public void cycleDoWhile(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите пароль:");
            password = sc.nextLine();
        } while (!password.equals("1234"));
    }

}
