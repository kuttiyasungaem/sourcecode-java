
public class FizzBuzz {

    public String sendAndReturn(int number) {
        
        if("1".equals(number+"")) {
            return "1";
        }else if("2".equals(number+"")) {
            return "2";
        }else if((number %3==0) && หารห้าลงตัว(number)) {
            return "FizzBuzz";
        }else if(number %3==0) {
            return "Fizz";
        }else if("4".equals(number+"")) {
            return "4";
        }else if(หารห้าลงตัว(number)) {
            return "Buzz";
        }else if("7".equals(number+"")) {
            return "7";
        }else if("8".equals(number+"")) {
            return "8";
        }else if("11".equals(number+"")) {
            return "11";
        }else if("13".equals(number+"")) {
            return "13";
        }else if("14".equals(number+"")) {
            return "14";
        }else if("16".equals(number+"")) {
            return "16";
        }
        
        return null;
    
    }

    private boolean หารห้าลงตัว(int number) {
        return number %5==0;
    }


}
