package Lesson01.HomeWork01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotMy{

//1. ��������� ����� ����� �� 1 �� n � n! (������������ ����� �� 1 �� n)

    public class HW1_Sum1toN {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� n:");
            int n= scanner.nextInt();
            System.out.printf("����� �� 1 �� n ����� %s\n", countNTriangle(n));
            System.out.printf("������������ �� 1 �� n ����� %s", factorial(n));
            scanner.close();
        }

        public static int countNTriangle(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;

            }
            return sum;
        }
        public static int factorial(int n) {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;

            }
            return f;
        }
    }

//
//2. ������� ��� ������� ����� �� 1 �� 1000

    public class HW2_PrintPrime {

        public static void main(String[] args) {
            for (int index = 1; index < 1000; index++) {
                if (checkSimpleNumber(index) == true) {
                    System.out.println(index);
                }
            }
        }

        public static Boolean checkSimpleNumber(int num) {   //������� ���������� ��� �����

            for (int index = 2; index <= Math.sqrt(num); index++) {
                if ((num == 1) || (num % index == 0)) {
                    return false;
                }
            }
            return true;
        }

    }



//3. ����������� ������� ����������� + - / *

    public class HW3_Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //���� ��� ������� � ����������!
            System.out.println("Enter the first number...");
            int a = scanner.nextInt();
            System.out.println("Enter the operator (+ - * /)...");
            char op = scanner.next().charAt(0);
            System.out.println("Enter the second number...");
            int b = scanner.nextInt();
            switch (op) {
                case '+':
                    System.out.println(a + " + " + b + " = " + add(a, b));
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + minus(a, b));
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + mult(a, b));
                    break;
                case '/':
                    System.out.println(a + " / " + b + " = " + divide(a, b));
                    break;
                default:
                    System.out.println("Wrong operation!");
            }
            scanner.close();
        }

        private static int divide(int a, int b) {
            if (b != 0) return a/b;
            else
                return -1;
        }

        private static int mult(int a, int b) {
            return a * b;
        }

        private static int minus(int a, int b) {
            return a - b;
        }

        private static int add(int a, int b) {
            return a + b;
        }
    }




//4. *+������ ��������� ���� q + w = e, q, w, e >= 0. ��������� ����� ����� ���� �������� ������ �������, �������� 2? + ?5 = 69. ��������� ������������ ��������� �� ������� ���������. ���������� ���� �� ���� ������� ��� ��������, ��� ��� ���.


    public class HW4_Equation {
        public static void main(String[] args) {
            // ������ ��������� �� ����� input.txt
            String inputString = getDataFromFile("C:\\Users\\ovash\\Downloads\\JAVA\\Seminar1\\input.txt");
            System.out.println("Given the equation: " + inputString);
            // ����� ����������
            System.out.println(getSolution(inputString));
        }


        public static String getSolution(String str) {
            // ��������� ������. ����������� - ������, "+" � "=" ���������
            ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
            list.remove("+");
            list.remove("=");


            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    // �������� "?" � ����� �� 0 �� 9, ���������� � ����������� ���������
                    int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
                    int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(j)));
                    if (x + y == Integer.parseInt(list.get(2))) {
                        // ������� �������, ��������� ������ ������
                        return String.format("Result: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
                    }
                }
            }
            // ����� ������� ���
            return "No solution";
        }


        public static String getDataFromFile(String path) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                return br.readLine();
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return "";
            }
        }
    }

//    ������� 2 (�������������)


    public class HW4_Equation2 {
        public static void main(String[] args) {
            // ������ ��������� �� ����� input.txt
            String inputString = getDataFromFile("C:\\Users\\ovash\\Downloads\\JAVA\\Seminar1\\input.txt");
            System.out.println("���������: " + inputString);
            // ����� ����������
            getSolution(inputString);
        }


        public static void getSolution(String str) {
            // ������������ ���������� ������ ?
            int countSep = countChars(str, '?');
            System.out.println("�����������: " + String.valueOf(countSep));
            // ��������� ����������� ���� ����� 10 � ������� ���������� �����������
            for (int i = 0; i < Math.pow(10, countSep); i++){
                // ���������� � ����� �� ���� ��������� ���������
                // ���������� ������ �����������, ������� ����� ������������ ��� ����������� ����
                // �������� ������ ������
                // ��������, ���� ����������� 5: 00000, 00001, 00005
                String replacementString = String.format("%0"+String.valueOf(countSep) +"d", i);
                // ��������� ������ ���������
                String newstr = str;
                // ��������� �� ����� ������ ? �������������� ����� �� ������ �����������
                for (int j = 0; j < countSep; j++){
                    // ������ ? ���������� �� ������ ����� �� ������ �����������, ������ �� ������ � �.�.
                    newstr = newstr.replaceFirst(String.valueOf("\\?"), String.valueOf(replacementString.charAt(j)));
                }
                check(newstr);
            }

        }

        // ��������
        public static void check(String str) {
            // ��������� ������. ����������� - ������, "+" � "=" ���������
            ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
            list.remove("+");
            list.remove("=");
            // �������� ����������
            int x = Integer.parseInt(list.get(0));
            int y = Integer.parseInt(list.get(1));
            int z = Integer.parseInt(list.get(2));
            // ��������, ���������� �� ������ ���������
            if (x + y == z ){
                System.out.println(str);
            }
        }

        // ��������������� ������� ��� �������� ���������� ? � ������
        public static int countChars(String Input, char SomeChar ) {
            int count = 0;
            for (int i = 0; i < Input.length(); i++) {
                if (Input.charAt(i) == SomeChar) {
                    count++;
                }
            }
            return count;
        }
        // ������ �� �����
        public static String getDataFromFile(String path) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                return br.readLine();
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return "";
            }
        }
    }

}
