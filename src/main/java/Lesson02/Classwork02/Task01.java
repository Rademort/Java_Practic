package Lesson02.Classwork02;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(StringWithChar('A', 'B',12));
    }


    static void printStrArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" + array[i] + "} ");
        }
        System.out.println();
    }

    public static String StringWithChar(char c1, char c2, int n){
        char [] arr = new char[n];
        String s;
        if (n > 0 && n%2 == 0){
            for (int i = 0; i < n ; i+=2) {
                arr[i] = c1;
                arr[i+1] = c2;
            }
            s = Arrays.toString(arr);
            return s;
        }else {
            return s = "wrong N";
        }
    }

}
