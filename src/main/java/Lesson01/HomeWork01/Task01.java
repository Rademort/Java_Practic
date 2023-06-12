package Lesson01.HomeWork01;

//«адать одномерный массив и найти в нем минимальный и максимальный элементы

public class Task01 {
    public static void main(String[] args) {
        int [] array = new int[]{1,2,0,4,5,6,11,-1};
        System.out.println(Minimum(array));
        System.out.println(Maximum(array));
    }
    public static int Minimum(int[] array){
        int minimum = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
    return minimum;}

    public static int Maximum(int[] array){
        int maximum = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;}
}
