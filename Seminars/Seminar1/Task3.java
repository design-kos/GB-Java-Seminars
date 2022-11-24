import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        num1 = scanner.nextDouble();
        System.out.println("Введите оператор (+, -, *, /): ");
        op = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        num2 = scanner.nextDouble();
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Вы указали неверные оператор");
                return;
        }
        System.out.printf(num1 + " " + op + " " + num2 + " = " + result);
    }
}
