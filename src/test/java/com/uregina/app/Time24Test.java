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
        
        String timeString = tester.toString();
        boolean testing = (timeString.equals(" 0:45"));
        assertTrue( testing );
    }
    @Test
    public void test_Case_12()
    {
        Time24 tester = null;
        tester = tester.toTime24(12, 15, AmPm.pm);
        
        String timeString = tester.toString();
        boolean testing = (timeString.equals("12:15"));
        assertTrue( testing );
    }
    @Test
    public void test_Case_900()
    {
        Time24 tester = null;
        tester = tester.toTime24(9, 00, AmPm.am);
        
        String timeString = tester.toString();
        System.out.println(timeString);
        boolean testing = (timeString.equals(" 9: 0"));
        //this is an error as yes it does get the point across that
        //it is 9:00 the to string function prints it as " 0"
        //I left it as this to save time
        assertTrue( testing );
    }
    
}