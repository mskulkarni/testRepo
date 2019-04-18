package com.example.jenkins.demo.impl;

import org.springframework.stereotype.Service;

import com.example.jenkins.demo.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public int calculate(int a, int b) {
		
		//System.out.println("print value");
		
		return (a + b);
	

	}

}
