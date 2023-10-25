import java.util.Scanner;

public class Armstrongnew {

    // Function to calculate the power of a number
    static int power(int num, int p) {
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result *= num;
        }
        return result;
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        int n = 0;

        originalNum = num;

        // Count the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }

        originalNum = num;

        // Calculate the sum of digits raised to the power n
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += power(remainder, n);
            originalNum /= 10;
        }

        // Check if the number is an Armstrong number
        return num == result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
