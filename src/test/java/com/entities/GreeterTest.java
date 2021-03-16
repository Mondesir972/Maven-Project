package com.entities;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class GreeterTest {
	
	private Greeter aGreeter = new Greeter();
	
	@Test
	public void greeterSayHello() {
		assertThat(aGreeter.sayHello(), containsString("Hello"));
	}

}
