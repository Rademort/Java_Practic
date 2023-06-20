package Lesson03.HomeWork03;

//Пусть дан произвольный список целых чисел.
//1) Найти максимальное значение
//2) Найти минимальное значение
//3) Найти среднее значение
//4) Нужно удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomIntegerArrayList(10,10);

        System.out.println(list);
        int max = MaxValue(list);
        int min = MinValue(list);
        float averageValue = Average(list);
        System.out.println(max);
        System.out.println(min);
        System.out.println(averageValue);
        System.out.println(DeleteEvenNumbers(list));



    }

    public static ArrayList<Integer> RandomIntegerArrayList(int maxInteger, int size) {
        ArrayList<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxInteger));
        }
        return list;
    }

    public static int MaxValue(ArrayList<Integer> list){
        int maxValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxValue){
                maxValue = list.get(i);
            }
        }
        return maxValue;
    }

    public static int MinValue(ArrayList<Integer> list){
        int minValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minValue){
                minValue = list.get(i);
            }
        }
        return minValue;
    }

    public static float Average (ArrayList<Integer> list){
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
            }
        float averageValue = sum / list.size();

        return averageValue;
    }

    public static ArrayList<Integer> DeleteEvenNumbers(ArrayList<Integer> list){
        ArrayList<Integer> noEvenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0){
                noEvenList.add(list.get(i));
            }
        }
        return noEvenList;
    }

}
