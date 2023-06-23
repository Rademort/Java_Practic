package Lesson04.HomeWork04;

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("������� ������ (print/revert ��� ���������� ������):");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                System.out.println("������ � �������� �������:");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("��������� ��������� ������ ������� �� ������.");
                } else {
                    System.out.println("��� ����������� ����� ��� ��������.");
                }
            } else {
                list.addLast(input);
            }
        }
    }
}
