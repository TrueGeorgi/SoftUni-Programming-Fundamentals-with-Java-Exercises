import java.util.Scanner;

public class A01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        smallestNumber(number1, number2, number3);
    }
    public static void smallestNumber (int num1, int num2, int num3) {
        int smallest = Integer.MIN_VALUE;
        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        }
        else if (num2 < num1 && num1 < num3) {
            smallest = num2;
        }
        else  {
            smallest = num3;
        }

        System.out.println(smallest);
    }
}
