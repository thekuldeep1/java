import java.util.Scanner;

import javax.swing.plaf.nimbus.State;
import javax.swing.text.html.StyleSheet;

public class Function {
    //------------------------------------------------------Funtion------------------------------------------------
     public static void  printName(String name){
        System.out.print("your name: ");
           System.out.println(name);
             return;
        

        }
        

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.next();
        printName(name);
       
       


    }
    //------------------------------------------------------Sum-----------------------------------------------
    //---------------------------------------For Two normal values---------------------------------------------
       //public static int sumcalculate(int a,int b){
       //     int sum=a+b;
       //     System.out.println("sum ="+sum);
       //     return sum;
//
       // }
       // 

    
   // public static void main(String[] args){
   //     Scanner sc=new Scanner(System.in);
   //    
   //     System.out.print("Enter your no1: ");
   //     int x=sc.nextInt();
   //     System.out.print("Enter your no2: ");
   //     int y=sc.nextInt();
   //      sumcalculate(x, y);
   //    
//
//
   // }
//
//-//---------------------Use to many same variables-----------------------------------------------
   // public static int sumForMany(int...arr){
   //     int res=0;
   //     for(int a: arr){
   //         res+=a;
   //     }
   //     return res;
//
   // }
   // public static void main(String[] args){
   //     Scanner sc=new Scanner(System.in);
   //     int size=sc.nextInt();
   //     int[] marks = new int[size];
   //     for (int i = 0; i < size; i++) {
   //         System.out.print("Enter the value of "+marks[i]);
   //         int marks[i]=sc.nextInt();
   //         
   //     }

    }



