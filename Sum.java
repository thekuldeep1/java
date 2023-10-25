import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

     // Directly taken by programmer....****
        int a=3;
        int b=4;
        int sum=a+b;
        int diff=b-a;
        int mul=a*b;
        System.out.print("SUM = " );
        System.out.println(sum);
        System.out.print("Difference = ");
        System.out.println(diff);
        System.out.printf("MULTIPLY = %d " , mul );
        System.out.println(mul);

     //Taken by user ......*****
     Scanner As=new Scanner(System.in );
     System.out.print(" Enter the number 1 = ");
     int R=As.nextInt();
     System.out.print("\n Enter the number 2 = ");
     int S=As.nextInt();
     int add=R+S;
     System.out.print(" Sum = ");
     System.out.println(add);

     

    



    }
    
}
