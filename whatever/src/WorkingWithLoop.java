
public class WorkingWithLoop {

    public static void main(String[] args) {
        
        System.out.println("=====for บวก 1 ถึง  10====");
        int result = 0 ;
        for (int j = 1; j <= 10; j++) {
            result = result+j;
          
        }
     
        System.out.println(result);
        
        
        
        
        
        System.out.println("=====for====");
        for (int i = 0; i < 5; i++) {

            System.out.println(i);
        }

        int i = 0;
        System.out.println("======while====");
        while (i < 5) {

            System.out.println(i);
            i++;

        }

        i = 0;
        System.out.println("======do while====");
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }

}
