import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//  а так же n! (произведение чисел от 1 до n)

// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше число : ");
        int n = sc.nextInt();
        sc.close();

        int tre_n = 0;
        int fact_n = 1;
        for (int i = 1; i <= n; i++) {
            tre_n = tre_n + i;
            fact_n = fact_n * i;
        }

        System.out.printf("Ваше треугольное число : %d\n", tre_n );
        System.out.printf("Факториал вашего числа : %d", fact_n);
    }
}