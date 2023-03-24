
import java.util.Random;

//import org.w3c.dom.css.Counter;

// На шахматной доске расставить 8 ферзей так, 
// чтобы они не били друг друга. И вывести Доску. 
// Пример вывода доски 8x8

public class chess {
    public static void main(String[] args) {
     Integer[] ferz ={0,0,0,0,0,0,0,0}; // координаты фигур
     Random rnd = new Random();
     prt(ferz);
    while (true) {
        for (int i = 0; i < 8; i++) {
            ferz[i] = rnd.nextInt(0,8);
            //prt(ferz); 
            if (proverka(ferz)) {
                System.out.println("Ура ! Решение найдено.");
                prt_g(ferz);
                System.exit(0);
            }
        }
    }
        
    }
    public static boolean proverka(Integer[] figura) {
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (i == j ){continue;}
                if (figura[i] == figura[j] && i!=j) {
                    return false;
                }
                if (i<7){
                if (Math.abs(figura[i]-figura[i+1])<2){
                    return false;
                }
                }
                if( Math.abs( i - j ) ==
                Math.abs(figura[i]-figura[j])
                ){
                    return false;
                }
            }
            
        }
        return true;
    }
    public static void prt(Integer[] date) {
        for (int element : date) {
            System.out.print(element);
            
        }
        System.out.println();
    }
    private static void prt_g(Integer[] mass) {
        System.out.println("Найденное решение ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("o ");
                }
                
            }
            System.out.print("\n");
        }
    }
}
