package com.my.algorithm; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Revesal Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 8, 2019</pre> 
* @version 1.0 
*/ 
public class RevesalTest {
    Revesal revesal;
    int[] inarr = {1,3,0,5,8};
    int[] outarr = {8,5,0,3,1};

@Before
public void before() throws Exception {
    revesal = new Revesal();

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: revesalArray(int[] arr) 
* 
*/ 
@Test
public void testRevesalArrayArr() throws Exception { 
//TODO: Test goes here...
    Assert.assertArrayEquals(outarr,revesal.revesalArray(inarr));
} 

/** 
* 
* Method: toNum(int[] arr) 
* 
*/ 
@Test
public void testToNum() throws Exception { 
//TODO: Test goes here...

} 


} 
