/*
Задание 6: Массивы
Основное задание:
Создать массив из 5 целых чисел, вывести все элементы, найти сумму и максимальное значение.
Дополнительная задача:
Проверьте, содержит ли массив заданное число (например, 42).

* */

package WorkSix;

import java.util.Scanner;

public class WorkSix {
    private int[] mass = {10, 25, 7, 40, 18};
    private int sum;
    private int max = 0;
    private int numberUser;
    private boolean flag = false;

    public void mass(){
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        numberUser = sc.nextInt();

        System.out.println("Массив:");

        for(int i = 0; i < mass.length; i++){
            System.out.println((i + 1) + " элемент массива: " + mass[i]);
            sum += mass[i];

            if (max < mass[i])
                max = mass[i];

            if (numberUser == mass[i])
                flag = true;
        }

        System.out.println("Сумма всех элементов массива: " + sum);

        System.out.println("Максимальный элемент массива: " + max);

        if (flag)
            System.out.println("Данный элемент есть " + numberUser);
        else
            System.out.println("Данного элемент нету " + numberUser);
    }
}
