package Lesson01.HomeWork01;

// ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
// � � ������� �����(-��) ��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������).
// ���������� �������� ����� �� ���������� ����� �� ���������� ��������: ������� ����� ��������� �����, �� ���� [0][0], [1][1], [2][2], �, [n][n];

public class Task02 {
    public static void main(String[] args) {
        int [][] array = new int[5][5];
        PrintArray(array);
        System.out.println();
        int [][] arrayNew = DiagonalToOnes(array);
        PrintArray(arrayNew);


    }
    public static void PrintArray(int [][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] DiagonalToOnes(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        return arr;
    }
}
