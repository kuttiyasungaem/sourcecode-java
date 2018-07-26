import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void test02_return_2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2",result);
    }
    
    @Test
    public void test03_return_3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3",result);
    }
    
    @Test
    public void test04_return_22() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("22",result);
    }
    
    @Test
    public void test06_return_23() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23",result);
    }
    
    @Test
    public void test08_return_222() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        assertEquals("222",result);
    }
    
    @Test
    public void test10_return_25() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("25",result);
    }
    
    @Test
    public void test12_return_223() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        assertEquals("223",result);
    }


}
