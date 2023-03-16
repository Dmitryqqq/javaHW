import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, 
// удалить из него чётные числа

public class task2 {

    
    public static void main(String[] args) {
        
        Random rnd = new Random();
         ArrayList<Integer> data = new ArrayList<>();
         for (int i = 0; i < 10; i++) {
            data.add(rnd.nextInt(1, 10));           
         }

        System.out.println(data);

        for (int i = data.size()-1; i >= 0; i--) {

            if ( data.get(i) %2 == 0 ) data.remove(i);
        }
        System.out.println(data);
    }
}