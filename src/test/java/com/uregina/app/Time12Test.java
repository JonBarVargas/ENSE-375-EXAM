package com.uregina.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.uregina.exceptions.*;

/**
 * Unit test for simple App.
 */
public class Time12Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()throws InvalidTimeException
    {   
        
        Time12 tester = new Time12(1, 30, AmPm.pm);
        
        AmPm yeeters = tester.getAM_or_PM;
        //boolean testing = ((tester.getAM_or_PM()) == AmPm.pm);
        assertTrue( testing );
    }
}
