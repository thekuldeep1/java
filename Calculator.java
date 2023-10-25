import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner ku = new Scanner(System.in);
        System.out.print("Enter the no 1 =");
        int R = ku.nextInt();
        System.out.print("Enter the no 2 =");
        int K = ku.nextInt();
        System.out.print("Enter the OPERATOR =");
        char O = ku.next().charAt(0);
        {
            switch (O) {
                case '+':
                    System.out.println("ADDITION"); {
                    int Sum = R + K;
                    System.out.println("Sum=" + Sum);

                }
                    break;
                case '-':
                    System.out.println("SUBTRACTION"); {
                    int Sum = R - K;
                    System.out.println("Sub=" + Sum);

                }
                    break;
                case '*':
                    System.out.println("MULTIPLICATION"); {
                    int Sum = R * K;
                    System.out.println("Mul=" + Sum);

                }
                    break;

                case '/':
                    System.out.println("DIVISSION"); {
                    int Sum = R / K;
                    System.out.println("Div=" + Sum);

                }
                    break;

            }
        }

    }

}
