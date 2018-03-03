/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2.Lecture02;

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
public class GradeArrayTest {
    
    public GradeArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class GradeArray.
     */

    /**
     * Test of score2grade method, of class GradeArray.
     */
    @Test
    public void testScore2grade() {
        System.out.println("score2grade");
        double score = 70;
        double best = 65;
        char expResult = 'A';
        char result = GradeArray.score2grade(score, best);
        assertEquals(expResult, result);
    }

    /**
     * Test of getBestScore method, of class GradeArray.
     */
    @Test
    public void testGetBestScore() {
        System.out.println("getBestScore");
        double[] theScores = new double[]{50,65,80,45,77};
        double expResult = 80;
        double result = GradeArray.getBestScore(theScores);
        assertEquals(expResult, result,0.0001);
       
    }
    
}
