// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример


import java.util.ArrayList;
import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)

public class kalc {
    static ArrayList<Double> lis = new ArrayList<>();
    static String dey = null;
        Double num2 = null;
    static    Double num1 = null;
    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше 1 число : ");
        num1 =  Double.parseDouble( sc.nextLine());
       
        while (true) {
    
        while (true) {
            System.out.print("\nВведите действие +, -, *, /, q-отмена : ");
        
            dey = sc.nextLine();
          
           if (dey.equals("q")) {
            
            if (lis.size()>1) {
                lis.remove(lis.size()-1);
                num1 = lis.get(lis.size()-1);
                System.out.println("Буфер вычислений - "+lis);
            System.out.println("Ваше 1 число : "+num1);

            continue;
            }
            else {
                System.out.println("Буфер вычислений закончился");
                continue;
            }
          
        }
            if (dey.equals("+") || dey.equals("-") || dey.equals("*") || dey.equals("/")) {
                break;
            }
            else{
                System.out.println("Комманда не понята, введте комманду +, -, *, /, q-отмена: "+num1);
            }
       
        
        }
        
        
        System.out.print("\nВведите ваше 2 число : ");
        Double num2 = Double.parseDouble( sc.nextLine());
        
    
        double rez = 0;
        if (dey.equals("+")) rez = num1 + num2;
        if (dey.equals("-")) rez = num1 - num2;
        if (dey.equals("/")) rez = num1 / num2;
        if (dey.equals("*")) rez = num1 * num2;
        
        System.out.println("\n"+num1+" "+dey+" "+num2+" = "+rez);
        lis.add(rez);
        num1 = rez;
       
    }
}
}

