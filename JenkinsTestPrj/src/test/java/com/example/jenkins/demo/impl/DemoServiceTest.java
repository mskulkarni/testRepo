package com.example.jenkins.demo.impl;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.jenkins.demo.DemoService;



public class DemoServiceTest {
	
	DemoService demoService = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		demoService = new DemoServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculate() {
		//fail("Not yet implemented");
		assertEquals(5, demoService.calculate(2, 3));
	}

}
