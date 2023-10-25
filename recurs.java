public class recurs{
    //--------------------------------Print 5 To 1 reverse no---------------------
  /*   public static void printName(int n){
        if(n==0){
            return ;

        }
        System.out.println(n);
        printName(n-1);

    }
    public static void main(String[] args){
        int a= 5;
        printName(a);
    }*/
    //----------------------------------------Print 1 To 5 normal form of numbers------------------------
    /*public static void printName(int n){
        if(n==6){
            return ;

        }
        System.out.println(n);
        printName(n+1);

    }
    public static void main(String[] args){
        int a= 1;
        printName(a);
    }*/
    //------------------------------------------Sum of n Numbers------------------------------
    /*public static void printSum(int i , int n , int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);

    }
    public static void main(String[] args){
        int a=5;
        printSum(1, 5, 0);
    }*/
    //-------------------------------------------Factorial of n number-------------------------
    /*public static int facttorial(int n){
        if(n==1 || n==0){
            return 1;
          }
          int fact=n*facttorial(n-1);
          
          return fact;
    }
    public static void main(String[] args){
        int a=5;
        int ans =facttorial(a);
        System.out.println(ans);
    }*/
    ///-----------------------------------------------------Fibona series----------------------using recurive
// --------------output-------It's always gives sum of previous two numbers-----------
//----if n=7
// Example===0 1 1 2 3 5 8
   /*  public static void Printfib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        Printfib(b, c, n-1);
    }
    public static void main(String[] args){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        Printfib(a, b, n-2);

    }*/
    public static int calpower(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pwr=x*calpower(x, n-1);
        return pwr;


    }
    public static void main(String[] args){
        int x=2,n=5;
        int ans=calpower(x, n);
        System.out.println(ans);
    }

}
