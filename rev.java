 public class rev {
    public static void main(String[] args) {
         int n=153;
         int r,cout=0,temp=0;
         int k=n;
         //while(n>0){
         //   r=n%10;
         //   System.out.print(r);
         //  
         //   cout+=1;
         //   
         //   n=n/10;
         //   
         //}
         //System.out.println();
         //System.out.printf(  "  counting = %d ",cout);
         //while (n>0) {
         //  r=n%10;
         //  temp=temp*10+r;
         //  n=n/10;
         //  cout++;
         //
         //
         //  
         //} 
         //System.out.println(temp);
         //System.out.println(cout);
         // Armstrong no 
         while (n>0) {
           r=n%10;
           temp=r*r*r + temp;
           n=n/10;
           
   
   
           
         } 
         if (k==temp) {
           System.out.println("It is armstrong no");
         } else {
           System.out.println(" It's not a armstrong no");
         }
      

    }
   
}
