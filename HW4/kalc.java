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
        num1 = sc.nextDouble();
        while (true) {
            //double rez1 = kalculate (num1);
            kalculate (num1);
        }
        
        
        
    }
    public  static Double kalculate (double num) {
        //Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nВведите действие : ");
        
            dey = sc.nextLine();
            System.out.println(dey);
            if (dey.equals("q") || dey.equals("+") || dey.equals("-") || dey.equals("*") || dey.equals("/")) break;
       
        
        }
        
        if (dey.equals("q")) {
            if (!lis.isEmpty()) {lis.remove(lis.size()-1);
            num = lis.get(lis.size()-1);
            System.out.println("Ваше 1 число : "+num);
            }
            else {
                System.out.println("Список вычислений пуст");
            }
            kalculate (num);
        }
        System.out.print("\nВведите ваше 2 число : ");
        Double num2 = sc.nextDouble();
        //sc.close();
    
        double rez = 0;
        if (dey.equals("+")) rez = num + num2;
        if (dey.equals("-")) rez = num - num2;
        if (dey.equals("/")) rez = num / num2;
        if (dey.equals("*")) rez = num * num2;
        
        System.out.println("\n"+num+" "+dey+" "+num2+" = "+rez);
        lis.add(rez);
        num1 = rez;
        System.out.println(lis);
        return rez;
    }    
    }

