package Lesson01.ClassWork01;

//Дан массив двоичных чисел, например [1,1,0,1,1,1],
//вывести максимальное количество подряд идущих 1.


public class Task02 {
    public static void main(String[] args) {
        int [] array = new int[]{1,1,0,1,1,1};
        System.out.println(maxOfNumberRow(array, 1));
    }

    public static int maxOfNumberRow(int [] arr, int number) {
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                tempCount ++;
                if (count < tempCount){
                    count = tempCount;
                }
            }else {
                if (count < tempCount){
                    count = tempCount;
                }
                tempCount = 0;
            }
        }
        return count;
    }
}

