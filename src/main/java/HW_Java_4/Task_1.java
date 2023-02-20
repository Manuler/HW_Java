package HW_Java_4;

//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_1 {
    public static <string> void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = 0;

        System.out.println("Enter the strings, divided by comma:");
        String tmp = br.readLine();
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(tmp.split(",")));

        for (String element : myList) {
            length++;
        }
        String print = "print";
        String revert = "revert";
        System.out.println(myList);

        System.out.println("Enter print or revert");

        Scanner userInput = new Scanner(System.in);
        String command = userInput.next();
        if (command.equals(print)) {
            System.out.println("Displaying Strings: ");
            for (int i = length - 1; i >= 0; i--) {
                System.out.println(myList.get(i));
            }
        } else if (command.equals(revert)) {
            System.out.println(myList.toString());
            myList.remove(length - 2);
            System.out.println(myList.toString());
        }

    }
}