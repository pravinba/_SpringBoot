package com.zorro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class myApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("These are arguments used to start the app:");
		for(String arg:args.getOptionNames()){
			System.out.println(arg);
		}
	}

}
