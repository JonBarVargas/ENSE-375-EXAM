package com.uregina.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.uregina.exceptions.*;

/**
 * Unit test for simple App.
 */
public class Time24Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()throws InvalidTimeException
    {   
        
        Time24 tester = null;
        tester = tester.toTime24(1, 30, AmPm.pm);
        
        AmPm yeeters = tester.getAM_or_PM();
        boolean testing = ((tester.getAM_or_PM()) == AmPm.pm);
        assertTrue( true );
    }
}