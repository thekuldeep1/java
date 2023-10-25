import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class Loops {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no = ");
        int n=sc.nextInt();
        int i =1;

//-----------------------------With thw help of while loop---------------------------------------------------------//     
/*System.out.println("With the help of  while loop");   
          while (i<11) {

            int mul=i*n;
            System.out.printf("%d * %d = %d\n",n,i,mul);
            i++; }*/

//--------------------------------With thw help of do while loop-----------------------------------------------------//            
           System.out.println("With the help of do while loop"); 
        do {
             int mul=i*n;
             System.out.printf("%d * %d = %d\n",n,i,mul);
             i++; 
             }while (i<11);

//--------------------------------With the help of for loop----------------------------------------------------------//
/*System.out.println("With the help of for loop");
for (i=1; i < 11; i++) {
                         int mul=i*n;
                         System.out.printf("%d * %d = %d\n",n,i,mul);
              
                
                        }      */       
           
            
            } 
    }

