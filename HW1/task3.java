import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше число : ");
        Double num1 = sc.nextDouble();
        System.out.print("\nВведите действие : ");
        String dey0 = sc.nextLine();
        String dey = sc.nextLine();
        System.out.print("\nВведите ваше число : ");
        Double num2 = sc.nextDouble();
        sc.close();

        double rez = 0;
        if (dey.equals("+")) rez = num1 + num2;
        if (dey.equals("-")) rez = num1 - num2;
        if (dey.equals("/")) rez = num1 / num2;
        if (dey.equals("*")) rez = num1 * num2;
            
        

        System.out.println("\n"+num1+" "+dey+" "+num2+" = "+rez);


        
    }
}
