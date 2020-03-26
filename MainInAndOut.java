package ru.geekbrains.test_in_out.lesson_6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainInAndOut {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //создаем 2 текстовых файла
        try {
            String doc1 = "As evening fell, it began to get very cold; and growing twilight seemed \\n\" +\n" +
                    "            \"to merge into one dark mistiness the gloom of the trees, oak, beech and pine,\\n\" +\n" +
                    "                    \"though  in the valleys which run deep between the spurs of the hills, as we \\n\" +\n" +
                    "                    \"ascended through the Pass , the dark furs stood outhere and there against the \\n\" +\n" +
                    "                    \"background of late-lying snow.";
            FileOutputStream docFOS = new FileOutputStream("doc1.txt");
            docFOS.write(doc1.getBytes());
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        try {
            String doc2 = "Sometimes, as the road was cut through the pine woods, it seemed in the darkness to be closing down \n" +
                    "upon us, great masses which here and there bestrewed the trees , produced a peculiarly weird and\n" +
                    "solemn effect.";
            FileOutputStream docFOS2 = new FileOutputStream("second.txt");
            docFOS2.write(doc2.getBytes());
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        //соединяем файлы с добавлением текста из второго файла в конец первого
        File docFIS = new File("doc1.txt");
        File docFIS2 = new File("second.txt");

        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream(docFIS, true));
        BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(docFIS2));

        int i;
        while ((i = fileIn.read()) != -1) {
            fileOut.write(i);
        }
        fileIn.close();
        fileOut.close();


        //поищем слова в файле doc1
        String findWord = "pine";
        FileInputStream doc1 = new FileInputStream(new File("C:/Users/User/Desktop/Geekbrains/java/testInOut/doc1.txt"));
        byte[] text = new byte[doc1.available()];
        doc1.read(text);
        doc1.close();
        String[] lines = new String(text, StandardCharsets.UTF_8).split(",");
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.equals(findWord)) {
                    System.out.println("Слово " + findWord + " есть в этом тексте!");
                } else
                    System.out.println("Совпадений не обнаружено");
            }
        }
    }
}



