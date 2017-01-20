package com.gwt.client.login_module.client;


import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.gwt.client.login_module.client.gin.Injector;
import com.gwt.client.login_module.client.mvp.DemoActivityMapper;
import com.gwt.client.login_module.client.mvp.DemoPlaceHistoryMapper;
import com.gwt.client.login_module.client.mvp.place.LoginPlace;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LoginEntryPoint implements EntryPoint {
	private LoginPlace defaultPlace = new LoginPlace();

	@Override
	public void onModuleLoad() {
		SimplePanel appWidget = new SimplePanel();
		final Injector injector = Injector.INSTANCE;
		EventBus eventBus = injector.getEventBus();
		PlaceController placeController = injector.getPlaceController();

		// activate activity manager and init display
		ActivityMapper activityMapper = new DemoActivityMapper();
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(appWidget);
//
		// display default view with activated history processing
		DemoPlaceHistoryMapper historyMapper = GWT.create(DemoPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);
		RootPanel.get().add(appWidget);

		History.newItem("login:");
	}
}
