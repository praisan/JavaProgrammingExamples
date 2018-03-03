/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Praisan.pad
 */
public class RegisterTest {
 @Test
 public void NumberLessthanZeroOrMorethanOneHundredReturnNull() { //0-100
     int[] scoreOutRange={-1, 1, 3, 50};
        int[] result = Register.findMinMax(scoreOutRange);
        assertNull(result);        
    }
    
}
