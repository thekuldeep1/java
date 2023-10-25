public class continuebreak {
    public static void main(String[] args){
       // -------------------------------------Using break statement----------------------//
      /*   for (int i = 0; i < 5; i++) {
           
            if (i==3) {
            System.out.println(" i is equal to 3");
                break;
            } System.out.printf(" Use break  statement %d  \n",i);
            
        }*/
        ///----------------------------------------------Using continue statement--------------------------
        int i=0;
        while (i<5) {
            if (i==3) {
                System.out.println(" i is equal to 3");
                break;
                 }
                 System.out.printf(" Use break  statement %d  \n",i);
                 i++;
            
        }
        
    }
    
}
