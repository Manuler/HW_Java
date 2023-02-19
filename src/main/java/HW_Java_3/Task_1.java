package HW_Java_3;

import java.util.*;

public class Task_1 {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<Integer>();
            Random r = new Random();
            numbers.add(r.nextInt(1, 11));
            numbers.add(r.nextInt(1, 11));
            numbers.add(r.nextInt(1, 11));
            numbers.add(r.nextInt(1, 11));
            numbers.add(r.nextInt(1, 11));
            numbers.add(r.nextInt(1, 11));
            System.out.println("Unsorted List: " + numbers);

            for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){
                Integer number = iterator.next();
                if(number % 2 == 0) {
                    System.out.println("This is even number: " + number);
                    iterator.remove();
                }
            }
            Collections.sort(numbers);
            System.out.println("Sorted List: " + numbers);
        }

    }

