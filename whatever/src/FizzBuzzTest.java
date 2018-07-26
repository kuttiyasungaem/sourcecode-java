import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void one_return_one() {
        FizzBuzz fz = new FizzBuzz();// 1 //5 cleat มัน
        String result = fz.sendAndReturn(1); // 3//2
        assertEquals("1", result);// 4 เป็นการ check ว่าถูกไหม
    }

    @Test
    public void two_return_two() {
        FizzBuzz fz = new FizzBuzz();
        String result2 = fz.sendAndReturn(2);
        assertEquals("2", result2);
    }

    @Test
    public void three_return_fizz() {
        FizzBuzz fz = new FizzBuzz();
        String result3 = fz.sendAndReturn(3);
        assertEquals("Fizz", result3);
    }

    @Test
    public void four_return_four() {
        FizzBuzz fz = new FizzBuzz();
        String result4 = fz.sendAndReturn(4);
        assertEquals("4", result4);
    }

    @Test
    public void five_return_Buzz() {
        FizzBuzz fz = new FizzBuzz();
        String result5 = fz.sendAndReturn(5);
        assertEquals("Buzz", result5);
    }
    
    @Test
    public void six_return_Fizz() {
        FizzBuzz fz = new FizzBuzz();
        String result6 = fz.sendAndReturn(6);
        assertEquals("Fizz", result6);
    }

    @Test
    public void seven_return_seven() {
        FizzBuzz fz = new FizzBuzz();
        String result7 = fz.sendAndReturn(7);
        assertEquals("7", result7);
    }

    @Test
    public void eight_return_eight() {
        FizzBuzz fz = new FizzBuzz();
        String result8 = fz.sendAndReturn(8);
        assertEquals("8", result8);
    }

    @Test
    public void nine_return_Fizz() {
        FizzBuzz fz = new FizzBuzz();
        String result9 = fz.sendAndReturn(9);
        assertEquals("Fizz", result9);
    }

    @Test
    public void ten_return_Buzz() {
        FizzBuzz fz = new FizzBuzz();
        String result10 = fz.sendAndReturn(10);
        assertEquals("Buzz", result10);
    }

    @Test
    public void eleven_return_eleven() {
        FizzBuzz fz = new FizzBuzz();
        String result11 = fz.sendAndReturn(11);
        assertEquals("11", result11);
    }

    @Test
    public void twelve_return_Fizz() {
        FizzBuzz fz = new FizzBuzz();
        String result12 = fz.sendAndReturn(12);
        assertEquals("Fizz", result12);
    }

    @Test
    public void thirteen_return_thirteen() {
        FizzBuzz fz = new FizzBuzz();
        String result13 = fz.sendAndReturn(13);
        assertEquals("13", result13);
    }

    @Test
    public void foureteen_return_fourteen() {
        FizzBuzz fz = new FizzBuzz();
        String result14 = fz.sendAndReturn(14);
        assertEquals("14", result14);
    }

    @Test
    public void fifteen_return_FizzBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result15 = fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result15);
    }

    @Test
    public void sixteen_return_sixteen() {
        FizzBuzz fz = new FizzBuzz();
        String result16 = fz.sendAndReturn(16);
        assertEquals("16", result16);
    }

}
