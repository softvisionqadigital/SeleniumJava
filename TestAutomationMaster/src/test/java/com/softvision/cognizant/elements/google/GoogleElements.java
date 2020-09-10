package com.softvision.cognizant.elements.google;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GoogleElements 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GoogleElements( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GoogleElements.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
