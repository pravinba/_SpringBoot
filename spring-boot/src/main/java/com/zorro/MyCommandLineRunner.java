package com.zorro;

import org.springframework.boot.CommandLineRunner;

public class MyCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("These are arguments used to start the app:");
		for(String arg:args){
			System.out.println(arg);
		}
		
	}

}
