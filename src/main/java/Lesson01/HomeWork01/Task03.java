package Lesson01.HomeWork01;
import java.util.Scanner;
import java.time.LocalDateTime;

//� ������� ��������� ��� ������������. � ����������� �� �������� �������, ������� ����������� ����:
//        "������ ����, <���>!", ���� ����� �� 05:00 �� 11:59
//        "������ ����, <���>!", ���� ����� �� 12:00 �� 17:59;
//        "������ �����, <���>!", ���� ����� �� 18:00 �� 22:59;
//        "������ ����, <���>!", ���� ����� �� 23:00 �� 4:59
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���: ");
        String userName = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        if(hour >= 5 && hour <= 11){
            System.out.println("������ ����, " + userName+ "!");
        }else if (hour >= 12 && hour<= 17){
            System.out.println("������ ����, " + userName+ "!");
        }else if (hour >= 18 && hour<= 22){
            System.out.println("������ �����, " + userName+ "!");
    }else {
            System.out.println("������ ����, " + userName+ "!");
        }
}}
