package HW2;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом 
// (возвращает boolean значение). Без встр. функций


public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Cp866");
        System.out.println("Введите строку : ");
        String text = sc.nextLine();
        
        
        //String text_p = palindrom(text).replaceAll("\\s", "");

        //System.out.println(text_p);

        if (palindrom(text)){
            System.out.println("Является палиндромом ");
        }
        else{
            System.out.println("Не является палиндромом ");
        }
    }
    public static Boolean palindrom ( String data) {
        data = data.replaceAll("\\s", "");
       
        StringBuilder data1 = new StringBuilder();
        for (int i = data.length()-1; i >= 0; i--) {
          
            data1.append(data.charAt(i));
            
        }
        String data2 = data1.toString();
        return data.equalsIgnoreCase(data2);
    }
}
