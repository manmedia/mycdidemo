package com.mycdiproject.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mycdiproject.configurator.ModuleConfigurator;
import com.mycdiproject.entities.MyOuterType;

public class AppRunner {
	
	public static void main(String[] args) {
		Injector guiceInjector = Guice.createInjector(new ModuleConfigurator());
		MyOuterType inst = guiceInjector.getInstance(MyOuterType.class);
		inst.doSomething();
	}

}
