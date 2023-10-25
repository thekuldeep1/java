import java.util.Scanner;

public class simpleintrest {

    static int calcSimpleInterest(int principle, int rate, int time) {
        int simpleInt = (principle * rate * time) / 100;
        return simpleInt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle");
        int p = scanner.nextInt();
        System.out.println("Enter the rate");
        int r = scanner.nextInt();
        System.out.println("Enter the time duration");
        int t = scanner.nextInt();

        int res = calcSimpleInterest(p, r, t);
        System.out.println("This is the simple interest  " + res);

    }
}
