package Lesson01.ClassWork01;

//        �������� ���������, ������� �������� ������������ ������ <���> � �������.
//        ������� ��������� ������ � ������� � ������� ��������� �������, <���>!�

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
        System.out.println("������� ��� ������������: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();

        System.out.println("������, " + name);
         if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
             System.out.println("������ ����, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
             System.out.println("������ ����, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
             System.out.println("������ �����, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                 & Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
             System.out.println("������ ����, " + name + "!");
         }
    }
}
