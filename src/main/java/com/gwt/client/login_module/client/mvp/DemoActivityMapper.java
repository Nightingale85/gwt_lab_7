package com.gwt.client.login_module.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.gwt.client.login_module.client.mvp.activity.LoginActivity;
import com.gwt.client.login_module.client.mvp.place.LoginPlace;
import com.gwt.client.main_module.client.mvp.activity.GreetingActivity;
import com.gwt.client.main_module.client.mvp.place.GreetingPlace;


public class DemoActivityMapper implements ActivityMapper {
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof LoginPlace) {
			return new LoginActivity();
		} else if (place instanceof GreetingPlace) {
			return new GreetingActivity();
		}
		return null;
	}
}
