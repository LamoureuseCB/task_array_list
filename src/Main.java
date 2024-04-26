import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// Задача о слиянии двух отсортированных списков:
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(3);
        numList.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        ArrayList<Integer> unsortedList = new ArrayList<>();

        for (int i = 0; i < numList.size(); i++) {
            unsortedList.add(numList.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            unsortedList.add(list2.get(i));
        }
        System.out.println(unsortedList);

//сортировка по возрастанию вручную,глядя на распечатанный результат и индекс
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(unsortedList.get(0));
        sortedList.add(unsortedList.get(3));
        sortedList.add(unsortedList.get(1));
        sortedList.add(unsortedList.get(4));
        sortedList.add(unsortedList.get(2));
        sortedList.add(unsortedList.get(5));
        System.out.println(sortedList);
        System.out.println();

//        Задача об удалении повторяющихся элементов:
        ArrayList<Integer>  numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(2);
        numsList.add(2);
        numsList.add(3);
        numsList.add(3);
        numsList.add(4);

        ArrayList<Integer> newNumsList = new ArrayList<>();
        System.out.println(numsList);

        for (Integer digit : numsList) {
            if (!newNumsList.contains(digit)) {
                newNumsList.add(digit);
            }
        }
        System.out.println(newNumsList);


//        Задача о нахождении максимального и минимального элемента в списке:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(7);
        numbers.add(2);
        System.out.println(numbers);


        int max = 0;
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

//  Задача о создании списка уникальных элементов, встречающихся более одного раза:
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(5);
        originalList.add(6);

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer digit : originalList) {
            if (countNumberOfMatches(originalList, digit) > 1 && !uniqueList.contains(digit)) {
                uniqueList.add(digit);
            }
        }
        System.out.println(uniqueList);
    }
//    отдельный метод для подсчета количества совпадений числа в списке
//    затем в методе main буду сравнивать ,что если количества совпадений будет больше 1, то можно через цикл и метод contains записать  в новый уникальный список

    public static int countNumberOfMatches(ArrayList<Integer> list, int number) {
        int matchCount = 0;
        for (Integer element : list) {
            if (element.equals(number)) {
                matchCount++;
            }
        }
        return matchCount;
    }
}