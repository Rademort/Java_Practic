package Lesson02.Classwork02;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task04 {
    public static void main(String[] args) throws IOException {
        String s1 = CreateString("TEST ", 100);
        System.out.println(s1);
        WriteInFile(s1, "Text004.txt");

    }

    public static String CreateString(String startText, int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= number ; i++) {
            sb.append(startText);
        }
        return sb.toString();
    }

    public static void WriteInFile(String text, String pathName){
        File f1 = new File(pathName);
        try(FileOutputStream fos1 = new FileOutputStream(f1);
            OutputStreamWriter osw = new OutputStreamWriter(fos1, StandardCharsets.UTF_8)){
            osw.write(String.valueOf(text));
            System.out.println("File wrote");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
