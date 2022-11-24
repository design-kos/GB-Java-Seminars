import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = GetSum(num);
        int product = GetProduct(num);
        System.out.println("Сумма чисел от 1 до " + num + " равна " + sum);
        System.out.println("Произведение чисел от 1 до " + num + " равно " + product);
    }

    public static int GetSum(int num) {
        return (num * (num + 1) / 2);
    }

    public static int GetProduct(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}