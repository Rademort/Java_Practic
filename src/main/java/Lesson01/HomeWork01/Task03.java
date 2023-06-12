package Lesson01.HomeWork01;
import java.util.Scanner;
import java.time.LocalDateTime;

//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String userName = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        if(hour >= 5 && hour <= 11){
            System.out.println("Доброе утро, " + userName+ "!");
        }else if (hour >= 12 && hour<= 17){
            System.out.println("Добрый день, " + userName+ "!");
        }else if (hour >= 18 && hour<= 22){
            System.out.println("Добрый вечер, " + userName+ "!");
    }else {
            System.out.println("Доброй ночи, " + userName+ "!");
        }
}}
