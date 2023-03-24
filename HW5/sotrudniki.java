import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

// есть список сотрудников
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений.
// Отсортировать по убыванию популярности Имени.


public class sotrudniki {
    public static void main(String[] args) {
        HashMap<String, Integer> spis = new HashMap<String, Integer>();
        Integer temp = 0; 

        try {
          
            File file = new File("spisok.txt");     
            //создаем объект InputStreamReader для объекта File
            InputStreamReader fr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            //создаем BufferedReader с существующего InputStreamReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            
            String line = reader.readLine();
            while (line != null) {
                // считываем остальные строки в цикле
                String[] data = line.split(" "); // нечколько разделителей через вертикальную черту
                  //System.out.printf("Студент %s" ,data[0]);
            if (spis.containsKey(data[0])) {
                temp =spis.get(data[0]);
                spis.put(data[0], temp+1);
            } else {
                spis.put(data[0], 1);
            }
            line = reader.readLine(); 
            } 
            
            reader.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(spis);
        //Сортируем
        while (!spis.isEmpty()) {
            
        
        int Max_Value = (Collections.max(spis.values()));
        String Max_key = null;
        for(Entry<String,Integer>entry : spis.entrySet()){
            if (entry.getValue() == Max_Value) {
                System.out.printf(" \nИмя %s встречается %d раза", entry.getKey(),entry.getValue());
                Max_key = entry.getKey();
                break;
            }
        }
        spis.remove(Max_key);
    }
    }
}
