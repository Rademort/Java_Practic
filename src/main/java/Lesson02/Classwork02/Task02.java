package Lesson02.Classwork02;
import  Lesson02.Classwork02.Task01;

//Напишите метод, который сжимает строку: из аааббсссс в а3б2с4

public class Task02 {
    public static void main(String[] args) {
        String str = "AAAABBBCCFFDDDFERGG";
        System.out.println(str);
        System.out.println();
        System.out.println(getRLE(str));
        System.out.println();
        System.out.println(getRLE2(str));
    }

    public static String getRLE(String s){
        int count = 1;
        String sNew;
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])){
                count ++;
            }else {
                sb.append(arr[i - 1]);
                sb.append(count);
                count = 1;
            }
            if(i == arr.length - 1){
                sb.append(arr[i]);
                sb.append(count);
            }
        }


        return sb.toString();
    }

    public static String getRLE2(String s){
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length() ; i++) {
            if(s.charAt(i - 1) == s.charAt(i)){
                counter++;
            }else {
                sb.append(s.charAt(i - 1));
                if (counter > 1){
                    sb.append(counter);
                }
                counter = 1;
            }
            if (i == s.length() - 1){
                sb.append(s.charAt(i));
                if (counter > 1){
                    sb.append(counter);
                }
            }
        }
        s = sb.toString();
        return s;
    }


}
