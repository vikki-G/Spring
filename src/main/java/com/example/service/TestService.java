package com.example.service;

import org.springframework.stereotype.Service;
@Service
public class TestService {
public String test() throws Exception {
	
	return "Service method called";
}
public int add() {
	int a=10;
	int b=12;
	int c=a+b;
	return c;
}
public int sub()
{
	int a=10;
	int b=12;
	int c=a-b;
	return c;
}
public int mul()
{
	int a=10;
	int b=12;
	int c=a*b;
	return c;	
}
public int div()
{
	int a=10;
	int b=12;
	int c=a/b;	
	return c;	
}
}
