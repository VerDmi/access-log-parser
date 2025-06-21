import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        System.out.println(" ");
        System.out.println("Сумма чисел: ");
        System.out.println(firstNumber +" + " +secondNumber +" = " +sum);
        System.out.println("-----");
        System.out.println("Разность чисел: ");
        System.out.println(firstNumber +" - " +secondNumber +" = " +difference);
        System.out.println("-----");
        System.out.println("Произведение чисел: ");
        System.out.println(firstNumber +" * " +secondNumber +" = " +product);
        System.out.println("-----");
        System.out.println("Частное чисел: ");
        System.out.println(firstNumber +" / " +secondNumber +" = " +quotient);
    }
}
