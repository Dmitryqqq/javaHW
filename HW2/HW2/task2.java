package HW2;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task2 {
 
    // построчное считывание файла
    public static void main(String[] args) {
        try {
            
            
            //String put = "F:/Study/learnJAVA/leksii/Javalec2/1.txt";  // можно прописать путь через другие слеши
            File file = new File("text2.txt");    // распознает другие слеши и сам их переворачивает
 
            //создаем объект InputStreamReader для объекта File
            InputStreamReader fr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            //создаем BufferedReader с существующего InputStreamReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                // считываем остальные строки в цикле
                String line1 = line.replace('"',' ');
                
                String[] data = line1.split(",|:");
                

            System.out.printf("Студент %s получил %s по предмету %s.\n",data[1],data[3],data[5]);

            
      
            line = reader.readLine(); 
            } 
            
            reader.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reader.close();
    }
}