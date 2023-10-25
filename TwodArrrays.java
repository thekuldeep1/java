import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class TwodArrrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r=sc.nextInt();
        System.out.print("Enter the coloum : ");
        int c=sc.nextInt();
        int[][] num=new int[r][c];
        //  input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter the value of [%d][%d]",i,j);
                num[i][j]=sc.nextInt();
                
            }
            
        }
        // output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(num[i][j]+"  ");
                
            }
            System.out.println();
        }



    }
    
}
