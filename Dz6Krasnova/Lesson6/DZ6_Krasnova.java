package Dz6Krasnova.Lesson6;

import java.io.*;

public class Main {
    private static OutputStream fos;
    private static InputStream fis;

    public static void main(String[] args) {
      cancatFiles("t1.txt","t2.txt","out.File.txt");

        try {
            FileOutputStream fos = new FileOutputStream("t1.txt");
            PrintStream printStream = new PrintStream(fos);
            printStream.println("Эублефар непременно станет всеобщим любимцем на долгое время, ведь продолжительность его жизни составляет 13-20 лет.");
        } catch (FileNotFoundException exception) {
            System.out.println("Ошибка.Файл не найден. Причина:  " + exception.getMessage());
        }


        try {
            FileOutputStream fos = new FileOutputStream("t2.txt");
            PrintStream printStream = new PrintStream(fos);
            printStream.println(" Однако известны случаи, когда эти рептилии доживали и до 30!");
        } catch (FileNotFoundException exception) {
            System.out.println("Ошибка.Файл не найден. Причина:  " + exception.getMessage());
        }

    }
    private static void cancatFiles(String inputFile1, String inputFile2,String outputFile){

        try {
            fos=new FileOutputStream(outputFile);
            int ch;
            fis=new FileInputStream(inputFile1);
            while ((ch=fis.read())!=-1)
                fos.write(ch);
            fis.close();

            fis=new FileInputStream(inputFile2);
            while ((ch=fis.read())!=-1) {
                fos.write(ch);
            }
           fis.close();

            fos.flush();
            fos.close();
        } catch (IOException exc){
            System.out.println("Ошибка. Причина:  " + exc.getMessage());
        }
    }

}
