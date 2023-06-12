package Lesson01.ClassWork01;

//��� ������ nums = [3,2,2,3] � ����� val = 3.
//���� � ������� ���� �����, ������ ���������, ����� ��������� ��� �������� � ����� �������.
//����� �������, ������ ��������� (��� ���) ��������� ������� ������ ���� ������� �� ���������, � ��������� - ����� ���.


public class Task03 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 3};
        int val = 3;

        printIntArray(toTheEnd(nums, val));

    }


    public static int[] toTheEnd(int[] arr, int a) {
        int end = arr.length - 1;
        for (int i = 0; i <= end; i++) {
            if (arr[i] == a) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
                i--;
            }
        }
        return arr;
    }

    static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


