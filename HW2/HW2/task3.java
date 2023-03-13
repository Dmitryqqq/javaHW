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
        text = text.replaceAll("\\s", "");
        //System.out.println(text);
        String text_p = palindrom(text).replaceAll("\\s", "");

        System.out.println(text_p);

        if (text.equalsIgnoreCase(palindrom(text))){
            System.out.println("Является палиндромом ");
        }
        else{
            System.out.println("Не является палиндромом ");
        }
    }
    public static String palindrom ( String data) {
        //System.out.println(data.length());
        StringBuilder data1 = new StringBuilder();
        for (int i = data.length()-1; i >= 0; i--) {
            //System.out.println(i);
            data1.append(data.charAt(i));
            //System.out.println(data.charAt(i));
        }

        return data1.toString();
    }
}
