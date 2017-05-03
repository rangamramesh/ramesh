package com.kitten;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KittenTest {
	Kitten kitten=null;
	@Before
	public void setUp() throws Exception {
		new Person("Feline");
		kitten=new Kitten();
	}

	@Test
	public void test1() {
		
		assertEquals("Amala the Feline",kitten.name("Amala"));
	}
	@Test
	public void test2() {
		
		kitten.name("Amala");
		kitten.haveBirthday();
		assertEquals("Amala the Feline is 1 and belongs to Feline",kitten.toString());
	}
	@Test
	public void test3() {
		
		assertEquals("Soumya the Feline",kitten.name("Soumya"));
	}
	@Test
	public void test4() {
		
		kitten.name("Soumya");
		kitten.haveBirthday();
		kitten.haveBirthday();
		assertEquals("Soumya the Feline is 2 and belongs to Feline",kitten.toString());
	}
	@Test
	public void test5() {
		kitten.name("Soumya");
		kitten.haveBirthday();
		kitten.haveBirthday();
		kitten.haveBirthday();
		assertEquals("Soumya the Feline is 3 and belongs to Feline",kitten.toString());
	}

}
