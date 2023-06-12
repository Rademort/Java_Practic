package Lesson01.ClassWork01;

//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {

        String s = "Добро пожаловать на курс по Java";
        System.out.println(s);
        reverse(s);

    }

    static void printStrArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" + array[i] + "} ");
        }
        System.out.println();
    }

//    static public void reverseString(String s){
//        String[] array = s.split(" ");
//        for (int i = 0; i < s.length() / 2; i++) {
//            String temp = array[i];
//            array[i] = array[(array.length - 1) - i];
//            array[(array.length - 1) - i] = temp;
//        }
//        s = Arrays.toString(array);
//        System.out.println(s);
//
//    }
    private static void reverse(String s) {
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length / 2; i++) {
            String tmp = s1[i];
            s1[i] = s1[s1.length - 1 - i];
            s1[s1.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(s1));

}}
