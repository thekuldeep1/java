import java.util.Scanner;
public class leapYear
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter year : ");
        int year = sc.nextInt();
        //if(((year%4==0)&&(year%100!=0))||(year%400==0))
        //this will also work.
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("LEAP YEAR ");
        }
        else
        {
            System.out.println(" NOT A LEAP YEAR ");
        }
    }
}