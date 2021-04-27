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
    public void test_Case_130()throws InvalidTimeException
    {   
        
        Time24 tester = null;
        tester = tester.toTime24(1, 30, AmPm.pm);
        
       // AmPm yeeters = tester.getAM_or_PM();
       String timeString = tester.toString();
        boolean testing = (timeString.equals("13:30"));
        assertTrue( testing );
    }
    @Test
    public void test_Case_0()
    {
        Time24 tester = null;
        tester = tester.toTime24(12, 45, AmPm.am);
        
       // AmPm yeeters = tester.getAM_or_PM();
       String timeString = tester.toString();
       System.out.println(timeString);
        boolean testing = (timeString.equals("0:45"));
        assertTrue( testing );
    }
}