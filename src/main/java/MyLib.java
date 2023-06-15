import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyLib {
    public static void printIntegerArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
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

    // —читывание строк с файла
    public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
        }
        br.close();
        String [] listData = new String [size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;

    }
    // ѕечать массива чисел
    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }

    public static void printArrayString(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
