
import java.util.Scanner;

public class conditionalsatate {
    public static void main(String[] args){
        Scanner ku=new Scanner(System.in);
        System.out.print("Enter the no  R = ");
        int r=ku.nextInt();
        System.out.print("Enter the no  K = ");
        int k=ku.nextInt();
        System.out.print("Enter the no  operator = ");
        char o = ku.next().charAt( 0); 
        {
/////////////////////////////////////////////------If Else Statement-------//////////////////////////////////////////////////
           /*  if (r>=18) {
                System.out.println("Adult");
                
            }else{
                System.out.println("Child");
            }*/
            //************************************************************************************************************* */
         
           /*  if (r%2==0) {
                System.out.println("it's Even");
                
            } else {
                System.out.println("It's Oddd");
                
            }*/
//*********************************************************************************************************************************** */
////////////////////////////////////////////--------If Else --- Else If-----?///////////////////////////////////////////////////   
          /*   if (r==k) {
                System.out.println("Both no are equal");
                
            }
            else if (r>k){
                System.out.println("R is greater then K");
            }
            else{
                System.out.println("K is greater then R");
            }*/
/////////////////////////////////////////-------Swith Case Statement----////////////////////////////////////////////////////////////
            switch (o) {
                case '+': System.out.println("Addition");{
                    int sum = r+k;
                    System.out.printf("Sum = %d", sum );
                     }

                break;
                case '-': System.out.println("Subtraction");{
                    int sub = r-k;
                    System.out.printf("Sub = %d",sub);
                      }
    
                break;
                case '*': System.out.println("Multiplication");{
                    int mul = r*k;
                    System.out.printf("Mul = %d",mul);
                      }
    
                break;
                case '%': System.out.println("Division");{
                    int div = r/k;
                    System.out.printf("Div = %d",div);
                      }
                break;      
                default:System.out.println("Enter valid operator");
                break;
            }            
        }
        
    }
    
}
