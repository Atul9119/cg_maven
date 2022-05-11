package com.cg;

//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertEqulas;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAdd()
    {
    	App app = new App();
        assertEquals(19, app.add(9, 10));
    }
}
