package com.gwt.client.common_module.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.gwt.client.common_module.client.layout.AppLayout;

/**
 * @author Sergiy_Solovyov
 */
public class LayoutEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        AppLayout appLayout = new AppLayout();
        RootLayoutPanel.get().add(appLayout);
    }
}
