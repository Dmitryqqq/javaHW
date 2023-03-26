import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

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
    
    
    public static void main(String[] args) {

        Notebook n1 = new Notebook(8, 1.0, "win", 3.6);
        Notebook n2 = new Notebook(16, 1.5, "linux", 3.7);
        Notebook n3 = new Notebook(16, 2.0,"win" , 3.7);
        Notebook n4 = new Notebook(32, 1.0,"win" , 3.8);
        Notebook n5 = new Notebook(16, 0.5,"win" , 3.6);
        n4.setColor("Wite");
        n3.setRAM(64);
        n1.setColor("Red");
        HashSet<Notebook> data = new HashSet<Notebook>(Arrays.asList(n1,n2,n3,n4,n5));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" 1 - Фильтр по ОЗУ");
            System.out.println(" 2 - Фильтр по объему ЖД");
            System.out.println(" 3 - Фильтр по Операционной системе");
            System.out.println(" 4 - Фильтр по цвету");
            System.out.println(" 5 - Вывести все");
            System.out.println(" 7 - Выход");
            String command = vvod("Введите комманду : ",sc);
            if (command.equals("1")){
                filtr_ram(data, sc);             
            }
            else if(command.equals("2")){
                filtr_hdd(data, sc);
            }
            else if(command.equals("3")){
                filtr_os(data, sc);
            }
            else if(command.equals("4")){
                filtr_col(data,  sc);
            }
            else if(command.equals("5")){
                Prnt(data);
            }
            else if (command.equals("7")) {
                System.exit(0);
                break;
            }
        }
    
    }
    public static String vvod(String msg,Scanner sc) {
        System.out.print(msg);
        String v1 = sc.nextLine();
        return v1;
    }
    public static void Prnt(HashSet<Notebook> data1) {
        for (Notebook element : data1) {
            System.out.println(element);
        }
    }
    
    public static void filtr_col(HashSet<Notebook> data ,Scanner sc) {
        HashSet<Notebook> data_f = new HashSet<Notebook>();
        String v4 = vvod("Введите интересующий цвет ", sc);
        
                for (Notebook note: data) {
                    if (note.getColor().equals(v4)) {
                        data_f.add(note);
                    }
                }
    System.out.println("По указанным параметрам : "+v4+ " найдено "+data_f.size()+" моделей");       
    Prnt(data_f);
        
    }
    public static void filtr_os(HashSet<Notebook> data ,Scanner sc) {
        HashSet<Notebook> data_f = new HashSet<Notebook>();
        String v4 = vvod("Введите интересующую систему :", sc);
        
                for (Notebook note: data) {
                    if (note.getOS().equals(v4)) {
                        data_f.add(note);
                    }
                }
    System.out.println("По указанным параметрам : "+v4+ " найдено "+data_f.size()+" моделей");       
    Prnt(data_f);
        
    }
    public static void filtr_hdd(HashSet<Notebook> data ,Scanner sc) {
        HashSet<Notebook> data_f = new HashSet<Notebook>();
        double vv = 0;
        while (true) {
            System.out.println("Введите интересующий обьем жесткого диска ");
            String v4 = vvod(" в Тераабайтах : ", sc);
            
            try { vv = Double.parseDouble(v4);
                //System.out.println("ввели дабл");
                break;
            } catch (Exception e) {
                System.out.println("Введено неверное значение, введите число");
            }
            //System.out.println(vv);
        }
        
                for (Notebook note: data) {
                    if (note.getHDD() == vv) {  // почему видимость vv только из основного тела
                        data_f.add(note);
                    }
                }
    System.out.println("По указанным параметрам : "+vv+"Тб найдено "+data_f.size()+" моделей");       
    Prnt(data_f);
        
    }
    public static void filtr_ram(HashSet<Notebook> data ,Scanner sc) {
        HashSet<Notebook> data_f = new HashSet<Notebook>();
        int vv1 = 0;
        int vv2 = 0;
        while (true) {
            String v1 = vvod(" Введите минимум ОЗУ в гигабайтах : ", sc);
            String v2 = vvod(" Введите максимум ОЗУ в гигабайтах : ", sc);
            
            try { vv1 = Integer.parseInt(v1);
                vv2 = Integer.parseInt(v2);
                break;
            } catch (Exception e) {
                System.out.println("Введено неверное значение, введите число");
            }
            
        }
        
                for (Notebook note: data) {
                    if (vv1 <= note.getRAM() && note.getRAM()<= vv2) {  // почему видимость vv только из основного тела
                        data_f.add(note);
                    }
                }
    System.out.println("В указанном диапазоне: "+vv1+" - "+vv2+"Гб найдено "+data_f.size()+" моделей");       
    Prnt(data_f);
        
    }
    
    

}

// public static void main(String[] args) throws ParseException {
//     String pattern = "dd-MM-yyyy";
//     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//     Cat cat1 = new Cat("Барсик", 6, true, 'м', "Русская дворовая", simpleDateFormat.parse("12-01-2018"));
//     cat1.meow();
//     cat1.meow(5);
//     System.out.println(cat1.humanAge() + " человеческих лет млекопитаюшему по имени " + cat1.getName());
//     System.out.println(cat1);
// }
