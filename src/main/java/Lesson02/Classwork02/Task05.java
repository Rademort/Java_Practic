package Lesson02.Classwork02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task05 {
    public static void main(String[] args) throws IOException {
        File file = new File("test05.txt");
        StringBuilder text = new StringBuilder(CreateString("TEXT", 100));
        String pathProject = System.getProperty("user.dir");
        System.out.println(pathProject);

        try(FileOutputStream fos1 = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos1, StandardCharsets.UTF_8)){
            osw.write(String.valueOf(text));
            System.out.println("File wrote");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        }


    public static String CreateString(String startText, int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= number ; i++) {
            sb.append(startText);
        }
        return sb.toString();
    }

}
