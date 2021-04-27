package com.uregina.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Time12Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {   
        try{
        Time12 tester = new Time12(1, 30, AmPm.pm);
        }catch(Exception e){
            
        }

        boolean testing = ((tester.getAM_or_PM()) == AmPm.pm);
        assertTrue( testing );
    }
}
