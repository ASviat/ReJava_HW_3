
/**
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа.
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner myInput = new Scanner(System.in);
        System.out.println("Введите количество вводимых значений: ");
        int numForArray = myInput.nextInt();
        if (numForArray < 1) {
            System.out.println("Извольте указать массив минимум из 1 элемента!");
            System.exit(numForArray);
        }

        LinkedList<Integer> myList = new LinkedList<Integer>();

        for (int i = 0; i < numForArray; i++) {
            System.out.printf("Введите значение %d: ", i + 1);
            myList.add(myInput.nextInt());
        }
        myInput.close();

        myList = FinArray(myList);
        System.out.println(myList);
    }

    public static LinkedList<Integer> FinArray(LinkedList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
            }
        }
        return list;
    }
}