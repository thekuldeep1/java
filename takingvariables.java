import java.util.Scanner;

public class takingvariables {
        public static void main (String[] args){

         //At the programm ......***

            String name;// It could'nt show error
            name="kuldeep";
          
         
  
            Integer a=2;
            float c=5.3F;
            double k=34.56D;
            Short r=34;
            char w='W';
            boolean q=true;
            a=3;

            System.out.println(a);
            System.out.println(name);
            System.out.println(c);
            System.out.println(w);
            System.out.println(q);
            System.out.println(r);
            System.out.println(k);

         //Taking vareable from user.....*****
         
         Scanner Rd=new Scanner(System.in);
         System.out.print("Enter a new number 1 = ");
         int R=Rd.nextInt();
         System.out.print("Enter a new number 2 = ");
         int C=Rd.nextInt();
        

        }
     }


