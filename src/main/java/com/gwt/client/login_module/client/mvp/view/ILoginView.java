package com.gwt.client.login_module.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface ILoginView extends IsWidget {

	void setPresenter(ILoginPresenter presenter);
	
	interface ILoginPresenter {
	}
}
