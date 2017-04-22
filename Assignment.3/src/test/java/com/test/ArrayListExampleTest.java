package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.ArrayListExample;

public class ArrayListExampleTest {
	/*ListExample le;
	@Before
	public void setUp()
	{
		le=new ListExample(13);
	}*/
	@Test
	public void getIndex_Test() 
	{
	ArrayListExample le=new ArrayListExample(13);
     le.add(5);
    int result=le.getIndexOf(5);
    assertEquals(0,result);
    }
	@Test
	public void get_Test() 
	{
		ArrayListExample le=new ArrayListExample(13);
        le.add(5);
        Object result=le.get(0);
        assertEquals(5,result);
    }
	@Test
	public void contains_Test() 
	{
		ArrayListExample le=new ArrayListExample(13);
        le.add(5);
        boolean result=le.contains(5);
        assertEquals(true,result);
    }
	@Test
	public void size_Test() 
	{
		ArrayListExample le=new ArrayListExample(13);
        le.add(5);
        le.add(45);
        le.add(6);
        
        int result=le.size();
        assertEquals(3,result);
    }
	@Test
	public void isEmpty_Test() 
	{
		ArrayListExample le=new ArrayListExample(13);
       /* le.add(8);*/
        boolean result=le.isEmpty();
        assertEquals(true,result);
    }
	@Test
	public void display_Test() 
	{
		ArrayListExample le=new ArrayListExample(13);
        le.add(5);
        le.add("hi");
        le.delete("hi");
        le.add("ramesh");
        le.add(10);
        le.add(15);
        
        String result=le.display();
        assertEquals("[5 ramesh 10 15 ]",result);
    }
	
}
