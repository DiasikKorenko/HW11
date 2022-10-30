import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        String[] array = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку №" + (i + 1));
            array[i] = sc.nextLine();
        }
        System.out.print("Введите номер задания: ");
        number = sc.nextInt();
        switch (number) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("Длинна строки №" + (i + 1) + " = " + array[i].length());
                }
                int max = array[0].length();
                int min = array[0].length();
                for (int i = 0; i < array.length; i++) {
                    if (max <= array[i].length()) {
                        max = array[i].length();
                    }
                    if (min >= array[i].length()) {
                        min = array[i].length();
                    }
                }
                System.out.println("самая длинная строка c размером = " + max);
                System.out.println("самая короткая строка с размером = " + min);

            case 2:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < i; j++) {
                        if (array[j].length() > array[j + 1].length()) {
                            String tmp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = tmp;
                        }
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Массив по возрастанию: " + array[i]);
                }

            case 3:
                int leng = 0;
                for (int i = 0; i < array.length; i++) {
                    leng += array[i].length();
                }
                System.out.println("Средняя длинна = " + (leng / 3));

                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() <= leng / 3) {
                        System.out.println("Строка " + array[i] + " длинна = " + array[i].length());
                    }
                }
            case 4:
                String temp = null;
                int flag = 0;
                for (int i = 0; i < array.length; i++) {
                    array[i].toCharArray();
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] != array[j]) {
                            continue;
                        } else {
                            flag += 1;
                            temp = array[i];
                            break;
                        }
                    }
                }
                if (flag != 0) {
                    System.out.println("слово, состоящее только из различных символов " + temp);
                } else {
                    System.out.println("такх слов нет");
                }
            case 5:
                for (int i = 0; i < 3; i++) {
                    String reversedString = new StringBuilder(array[i]).reverse().toString();
                    if (reversedString.equals(array[i])) {
                        System.out.println("This is palindrome: " + array[i]);
                    }
                }
        }
    }
}


