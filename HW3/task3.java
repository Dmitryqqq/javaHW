import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

public class task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           data.add(rnd.nextInt(1, 10));           
        }

       System.out.println(data);

       System.out.printf("Минимальное : %d\n",f_min (data));
       System.out.printf("Ср.Арфметическое : %s\n",f_sra(data));
       System.out.printf("Максимальное : %d\n",f_max(data));
    }

    private static Integer f_max(ArrayList<Integer> data1) {
        int num =data1.get(0);
        for (int  i= 1; i < data1.size(); i++) {
            if (data1.get(i) > num) num = data1.get(i);
        }       
        return num;
    }

    private static Double f_sra(ArrayList<Integer> data1) {
        int sum =0;
        for (int  i= 0; i < data1.size(); i++) {
            sum+=data1.get(i);
        }
        double num = (double)sum / (double)data1.size(); // По другому не удалось преобразовать
        return num;
    }

    public static Integer f_min (ArrayList<Integer> data1) {
        int num =data1.get(0);
        for (int  i= 1; i < data1.size(); i++) {
            if (data1.get(i) < num) num = data1.get(i);
        }        
        return num;
    }
}
