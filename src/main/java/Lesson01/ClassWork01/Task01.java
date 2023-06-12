package Lesson01.ClassWork01;

//        Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//        Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Calendar calend = new GregorianCalendar();
        System.out.println(calend);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        System.out.println("Введите имя пользователя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();

        System.out.println("Привет, " + name);
         if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
             System.out.println("Доброе утро, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
             System.out.println("Добрый день, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
             System.out.println("Добрый вечер, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
             System.out.println("Доброй ночи, " + name + "!");
         }
    }
}
