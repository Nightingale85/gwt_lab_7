package com.gwt.client.login_module.client.gin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.gwt.client.login_module.client.mvp.view.login.LoginView;
import com.gwt.client.main_module.client.mvp.view.greeting.GreetingView;

/**
 * @author Sergiy_Solovyov
 */
@GinModules(InjectorModule.class)
public interface Injector extends Ginjector {
     Injector INSTANCE = GWT.create(Injector.class);
     GreetingView getGreetingView();
     LoginView getLoginView();
     EventBus getEventBus();
     PlaceController getPlaceController();
}
