import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no Rows = ");
        int r=sc.nextInt();
        System.out.print("Enter the no Coloums = ");
        int c=sc.nextInt();
        ///----------------------------For making Solid rectangel----------------------//
        System.out.println("    New    ");
        System.out.println("For making Solid rectangel");

        for (int i =0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
            
        }



        System.out.println("    New    ");
        System.out.println("For making Wholo rectangel");


        for (int i = 1; i <= r; i++) {
            for (int j =1; j <= c; j++) {
                if (i==1 || j==1 || i==r || j==c) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
               
            
              }
              System.out.println();
            
        }
        System.out.println("    New    ");
        System.out.println("For making Half pyramid");


        for (int i = 1; i <= r; i++) {
            for (int j =1; j <= i; j++) {
                
                    System.out.print(" * ");
                }
                    System.out.println();
                }

                
        System.out.println("    New    ");
        System.out.println("For making Inverted Half pyramid");      
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {  
                 System.out.print(" * ");
                }
                    System.out.println();
                }


        System.out.println("    New    ");
        System.out.println("For making  Half pyramid At opposite direction ");      
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=r-i; j++) {  
                 System.out.print("   ");
                }
                for (int j = 1; j <=i; j++) {
                    System.out.print(" * ");
                    
                }
                System.out.println();
                
                   
                }

         System.out.println("    New    ");
         System.out.println("For making  Half pyramid in Decimal no");         
         for (int i = 1; i <=r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %d ",j );
                
            }
            System.out.println();
            
         }

         System.out.println("    New    ");
         System.out.println("For making  Half Inverted pyramid in Decimal no");  
         for (int i = r; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(" "+j);
                
            }
            System.out.println();
            
         }
         System.out.println("    New    ");
         System.out.println("For making  Half pyramid in Decimal no");  
         int number=1;       
         for (int i = 1; i <=r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  "+number);
                number++;
                
            }
            System.out.println();
            
         }

                        
                    }
                    
                }
            
              
             

        
    
    

