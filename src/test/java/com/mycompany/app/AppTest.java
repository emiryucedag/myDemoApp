package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;




/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testAddAndMultiply() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        int[] array = {2,4};
        String str1= "hello";
        String str2= "hi";

        //method doğru mu çalışıyor yanlış mı kontrolü
        assertEquals(87,new App().addAndMultiply(arrayList,array,str1,str2));
    }

    public void testEmptyArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = {2,4};
        String str1= "hello";
        String str2= "hi";

        //boş array listte 0 dönecek mi testi
        assertEquals(12,new App().addAndMultiply(arrayList,array,str1,str2));
    }

    public void testEmptyArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        int[] array = new int[5];

        String str1= "hello";
        String str2= "hi";

        //boş arrayde 0 dönecek mi testi
        assertEquals(75,new App().addAndMultiply(arrayList,array,str1,str2));

    }

    public void testEmptyStrings() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        int[] array = {2,4};
        String str1= "";
        String str2= "";

        //method doğru mu çalışıyor yanlış mı kontrolü
        assertEquals(0,new App().addAndMultiply(arrayList,array,str1,str2));
    }

    public void testNullStrings() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        int[] array = {2,4};
        String str1= null;
        String str2= null;

        //method doğru mu çalışıyor yanlış mı kontrolü
        assertEquals(0,new App().addAndMultiply(arrayList,array,str1,str2));

    }






}
/*
*
*  package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
//import org.junit.Test;


import static org.junit.Assert.*;



public class AppTest {
    public void testFound() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(new com.mycompany.app.App().search(array, 4));
    }

    public void testNotFound() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(new com.mycompany.app.App().search(array, 5));
    }

    public void testEmptyArray() {
        ArrayList<Integer> array = new ArrayList<>();
        assertFalse(new com.mycompany.app.App().search(array, 1));
    }

    public void testNull() {
        assertFalse(new com.mycompany.app.App().search(null, 1));
    }

}

*
* */