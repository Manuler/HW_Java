package HW_Java_3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        numbers.add(r.nextInt(1, 11));
        numbers.add(r.nextInt(1, 11));
        numbers.add(r.nextInt(1, 11));
        numbers.add(r.nextInt(1, 11));
        numbers.add(r.nextInt(1, 11));
        numbers.add(r.nextInt(1, 11));
        System.out.println("Unsorted List: " + numbers);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println(stats);
        Collections.sort(numbers);
        Set<String> s = new LinkedHashSet(numbers);
        System.out.println("This is List without duplicates: " + s);
    }

}
