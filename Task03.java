
/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner myInput = new Scanner(System.in);
        System.out.println("Введите количество вводимых значений: ");
        int numForArray = myInput.nextInt();
        if (numForArray <= 1) {
            System.out.println("Извольте указать массив минимум из 2 элементов!");
            System.exit(numForArray);
        }

        ArrayList<Integer> myList = new ArrayList<Integer>(numForArray);

        for (int i = 0; i < numForArray; i++) {
            System.out.printf("Введите значение %d: ", i + 1);
            myList.add(myInput.nextInt());
        }

        myInput.close();

        int mySum = 0;
        for (Integer i : myList) {
            mySum += i;
        }

        System.out.printf("Максимальное значение = %d\n", Collections.max(myList));
        System.out.printf("Минимальное значение = %d\n", Collections.min(myList));
        System.out.printf("Среднее значение = %.2f", (double) mySum / numForArray);
    }
}