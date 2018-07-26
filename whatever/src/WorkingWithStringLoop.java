
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "AOMSIN2018";
        //System.out.print(name.substring(0,1));
        System.out.println();
        
        
        for(int i=0;i<name.length();i++) {
       //System.out.print(name.charAt(i));//address
       //System.out.print(name.substring(i,i+1)); //เลื่อน index
            
       
       }
        
        while(name.length()>0) {
            name = name.substring(1);
            System.out.println(name);
            
        }
        
        
    }
}
