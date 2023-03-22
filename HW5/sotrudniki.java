import java.util.HashMap;

// есть список сотрудников
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений.
// Отсортировать по убыванию популярности Имени.


public class sotrudniki {
    public static void main(String[] args) {
        HashMap<String, String> spis = new HashMap<String, String>(); 

        spis.put( "иван","1");
        spis.put( "петр","1");
System.out.println(spis);
    }
}
