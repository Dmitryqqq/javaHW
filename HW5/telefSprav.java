//import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;

//import org.xml.sax.DTDHandler;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего

public class telefSprav {

    
    
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> spis = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123456);
        list.add(555555);
        spis.put("Иванов",list );
        
        
        Scanner sc = new Scanner(System.in ,"cp866");
        while (true) {
            System.out.println("введите 1 - Добавление номера");
           
            String comm = vvod("        2 - Вывод всего  :", sc);
            if (comm.equals("1")){ 
                increHashMap(spis, sc);
            }
            else if (comm.equals("2")) {
                for (Map.Entry<String, ArrayList<Integer>> item : spis.entrySet()) {
                    System.out.println(item);
                }
            }
            else {System.out.println(" Ваша комманда не понята ");}
            //System.out.println("Комманда - "+comm);
            
        }
        



    }
    public static String vvod(String msg,Scanner sc) {
        System.out.print(msg);
        String znach = sc.nextLine();      
         return znach;
    }
    //public static HashMap<String, ArrayList<Integer>> increHashMap(Map<String, ArrayList<Integer>> spis) {
     public static void increHashMap(HashMap<String, ArrayList<Integer>> spis, Scanner sc) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        int tel = 0;
         
        String name = vvod("Введите фамлию : ", sc);
        while (true) {
            String tel_s =vvod("Введите номер телефона : ", sc);
                    try
            {
            // именно здесь String преобразуется в int
             tel = Integer.parseInt(tel_s.trim());

            // выведем на экран значение после конвертации
            System.out.println("Телефон = " + tel);
            break;
            }
            catch (NumberFormatException nfe)
            {
            System.out.println("Введен не корректный телефон " + nfe.getMessage());
            }
            

        }
        
        if(spis.containsKey(name)){
            data = spis.get(name);
            data.add(tel);
            spis.put(name,data);
            //spis.get(name).add(tel);
            System.out.println("Добавлено к записи "+name);
        }
        else{
            
            data.add(tel);
            spis.put(name,data);
            System.out.println("Сделана новая запись  "+name+"  тел  "+data);
        }
        

    }
}