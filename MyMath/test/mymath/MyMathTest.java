package mymath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {
    @Test
    public void testPositiveNumberFac(){
        int x=5;
        int expected=120;
        int result=MyMath.factorial(x);
        assertEquals(expected, result);        
    }
    @Test
    public void testPositiveNumber2Fac(){
        int x=4;
        int expected=24;
        int result=MyMath.factorial(x);
        assertEquals(expected, result);        
    }
    @Test
    public void testZeroNumberFac(){
        int x=0;
        int expected=1;
        int result=MyMath.factorial(x);
        assertEquals(expected, result);  
    }
    
    @Test
    public void testFacOfNumber_1(){
        int x=1;
        int expected=1;
        int result=MyMath.factorial(x);
        assertEquals(expected, result);  
    }
    @Test
    public void testNagativeNumberFac(){
        int x=-10;
        int expected=-99;
        int result=MyMath.factorial(x);
        assertEquals(expected, result);        
    }
}
