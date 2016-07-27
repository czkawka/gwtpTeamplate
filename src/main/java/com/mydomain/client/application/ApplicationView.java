package com.mydomain.client.application;

import com.google.gwt.user.client.ui.SimplePanel;
import com.gwtplatform.mvp.client.ViewImpl;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
	private final SimplePanel main;
	ApplicationView() {
		main = new SimplePanel();
		initWidget(main);
		bindSlot(ApplicationPresenter.SLOT_MAIN, main);
	}
}
