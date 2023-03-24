// Подумать над структурой класса Ноутбук для магазина техники - 
// выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации 
// и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле


public class Main  {
    

    

}

public static void main(String[] args) throws ParseException {
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Cat cat1 = new Cat("Барсик", 6, true, 'м', "Русская дворовая", simpleDateFormat.parse("12-01-2018"));
    cat1.meow();
    cat1.meow(5);
    System.out.println(cat1.humanAge() + " человеческих лет млекопитаюшему по имени " + cat1.getName());
    System.out.println(cat1);
}
