package com.mycdiproject.configurator;

import com.google.inject.AbstractModule;
import com.mycdiproject.api.DisplayEnabled;
import com.mycdiproject.entities.MyDependentType;

public class ModuleConfigurator extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DisplayEnabled.class).to(MyDependentType.class);
		
	}

}
