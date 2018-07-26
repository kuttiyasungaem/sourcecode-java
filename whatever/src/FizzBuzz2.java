
public class FizzBuzz2 {

    public String sendAndReturn(int number) {
        String result = ""+number ;
       if(หารสามเเละห้าลงตัว(number)) {
           result = "FizzBuzz";
       }
       else if(หารสามลงตัว(number)) {
           result = "Fizz";
           
       }else if(หารห้าลงตัว(number)) {
           result = "Buzz";
           
       }

        return result;
        
    }

    private boolean หารสามลงตัว(int number) {
        return number % 3 == 0;
    }

    private boolean หารห้าลงตัว(int number) {
        return number % 5 ==0;
    }

    private boolean หารสามเเละห้าลงตัว(int number) {
        return หารสามลงตัว(number) &&หารห้าลงตัว(number);
    }

}
