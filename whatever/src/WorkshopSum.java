
public class WorkshopSum {

    public static void main(String[] args) {
        int sum = 0 ; 
        for (int i = 0; i < 11; i++) {
            sum =sum +i ;
        }
        System.out.println(sum);//55

   
    
    int sum2 = 0 ; 
    
    for (int j = 1; j < 11; j=j+2) { //i+=2
        sum2 =sum2 +j ;
    }
    System.out.println(sum2);//25


    
    //=====Workshop======heart=====
    
   // System.out.println("");
   
    
    for(int e = 0; e < 7; e++) {
        if(e == 1) {
        System.out.println(" **   ** ");
        }
        System.out.println("");

        for (int k = 0; k < 9; k++) { 

        System.out.print("*");
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
}

