package com.mydomain.client;



import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.mydomain.client.application.ApplicationModule;



public class ClientModule extends AbstractPresenterModule{

	@Override
	protected void configure() {
		 install(new DefaultModule.Builder()
	                .defaultPlace(NameTokens.HOME)
	                .errorPlace(NameTokens.HOME)
	                .unauthorizedPlace(NameTokens.HOME)
	                .build());
		install(new ApplicationModule());
	}

}
