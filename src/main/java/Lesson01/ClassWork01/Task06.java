package Lesson01.ClassWork01;

//Реализовать функцию возведения числа а в степень b. a, b из Z.
//Сводя количество выполняемых действий к минимуму.

public class Task06 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(powNumber(a, b));
        double t = (0.5 * a * (a + 1));
        System.out.println(t);
    }

    public static double powNumber(double number, int power){
        if (power == 0){
            return 1;
        }
        double result = powNumber(number, power/2);
        if (power % 2 == 0){
            return result * result;
        } else if(power > 0){
            return result * result * number;
        }else{
            return result * result * 1/number;
        }
    }

}
