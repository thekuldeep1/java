public class Prime {
 public static void main(String[] args) {
   // Print prime no in 1 To 100
   // int n=100;
   // for (int i = 1; i < n; i++) {
   //     int r=1;
   //     for (int j = 2; j < i; j++) {
   //         if (i%j==0) {
   //             r=0;
   //             break;
   //             
   //         }
   //         
   //     }
   //     if (r==1) {
   //         System.out.println(i);
   //     }
   //     
   // }
    int n=100;
    int count=0;
    for (int i = 1; i < n; i++) {
           if (n%i==0) {
             count++;
           }
       
    }

    if (count==2) {
        System.out.println(" prime");
    }
    else{
        System.out.println(" Not prime ");
    }
   }
    
}


