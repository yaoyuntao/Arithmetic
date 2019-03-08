package com.my.algorithm; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* PrimeNum Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 8, 2019</pre> 
* @version 1.0 
*/ 
public class PrimeNumTest {
    PrimeNum primeNum;

@Before
public void before() throws Exception {
    primeNum = new PrimeNum();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: prime(int i) 
* 
*/ 
@Test
public void testPrime() throws Exception { 
//TODO: Test goes here...
    Assert.assertEquals(true,primeNum.prime(199));
}
@Test
public void testPrimeT() throws Exception {
//TODO: Test goes here...
        Assert.assertTrue(primeNum.prime(199));
    }

@Test
public void testPrimeF() throws Exception {
//TODO: Test goes here...
        Assert.assertFalse(primeNum.prime(198));
    }
} 
