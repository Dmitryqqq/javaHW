// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
//  который вернет “перевернутый” список.

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;

import java.util.Scanner;


public class linked_list {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)throws Exception {
        
        LinkedList<String> lis = new LinkedList<String>();
        
        lis.add("23");
        lis.add("qwrty");
        lis.add("45");
        lis.add("ting");
        lis.add("100");

        Boolean flag = true;
        
        while (flag) {

            System.out.println("\nНаш список - "+lis);
            
            System.out.println(" 1 - перевернуть список");
            System.out.println(" 2 - добавить элнмент в конец очереди");
            System.out.println(" 3 - возвратить первый элемент из очереди и удалить его,");
            System.out.println(" 4 - возвратить первый элемент из очереди, не удаляя.");
            System.out.println(" 5 - Выход из программы");

            
            String v = vvod("\nВведите комманду ", sc );
            
            if (v.equals("1")){
                System.out.println(" ФУНКЦИЯ - reverse() ");
              
                lis = reverse(lis);
            } 
            else if (v.equals("2")) {
                System.out.println(" ФУНКЦИЯ - enqueue() ");
                String obg = vvod("Введите добавляемое значение ", sc);
                lis = enqueue(lis, obg);
            }
            else if (v.equals("3")) {
                System.out.println(" ФУНКЦИЯ - dequeue() ");
                System.out.println("Извлекаемое значение : "+dequeue(lis));
            }   
            else if (v.equals("4")) {
                System.out.println(" ФУНКЦИЯ - first() ");
                System.out.println("Вызываемое значение : "+first(lis) );
            }   
            else if (v.equals("5")) {
                System.out.println("Завершаю  работу");
                System.exit(0);
            } 
            else{ 
                System.out.println("Комманда не понята введите правильную комманду ");
            }
             
        }
     
    }
    public static String vvod (String msg, Scanner sc)  {
        
        System.out.print (msg+" " );
        String vv = sc.nextLine();
        
        return vv;
    }
    // реализация enqueue
    public static LinkedList<String> enqueue (LinkedList<String> data, String value) {
        data.add(value);
        return data;
    }
    // реализация dequeue
    public static String dequeue (LinkedList<String> data) {
        if( !data.isEmpty()){
        String a = data.get(0);
        data.remove(0);
        return a;
        }
        else{
            System.out.println("Список пуст ");
            return null;
        }       
    }
    // реализация first()
    public static String first (LinkedList<String> data) {
        if( !data.isEmpty()){
            String a = data.get(0);
            
            return a;
            }
            else{
                System.out.println("Список пуст ");
                return null;
            }       
    }
    // реализация reverse()
    public static LinkedList<String> reverse (LinkedList<String> data) {
        LinkedList<String> data1 = new LinkedList<String>();
        for (int index = data.size()-1; index >= 0; index--) {
            data1.add(data.get(index));    
    }
    return data1;
    }

}
