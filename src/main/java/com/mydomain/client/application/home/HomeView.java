package com.mydomain.client.application.home;

import com.google.gwt.user.client.ui.Button;
import com.gwtplatform.mvp.client.ViewImpl;


public class HomeView extends ViewImpl implements HomePresenter.MyView {
	HomeView() {
		initWidget(new Button("No witam"));
	}
}
