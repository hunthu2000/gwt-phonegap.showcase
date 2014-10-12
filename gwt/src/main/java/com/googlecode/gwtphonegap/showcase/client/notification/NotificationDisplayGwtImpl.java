package com.googlecode.gwtphonegap.showcase.client.notification;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.ui.client.widget.button.Button;
import com.googlecode.mgwt.ui.client.widget.header.HeaderButton;

public class NotificationDisplayGwtImpl extends Composite implements NotificationDisplay {

	private static NotificationDisplayGwtImplUiBinder uiBinder = GWT.create(NotificationDisplayGwtImplUiBinder.class);

	interface NotificationDisplayGwtImplUiBinder extends UiBinder<Widget, NotificationDisplayGwtImpl> {
	}

	@UiField
	Button alert;

	@UiField
	Button confirm;

	@UiField
	Button vibrate;

	@UiField
	Button beep;

	@UiField
	HeaderButton backButton;

	private Presenter presenter;

	public NotificationDisplayGwtImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;

	}

	@UiHandler("backButton")
	protected void onBackButtonPressed(TapEvent event) {
		if (presenter != null) {
			presenter.onBackButtonPressed();
		}
	}

	@UiHandler("alert")
	protected void onAlertButtonPressed(TapEvent event) {
		if (presenter != null) {
			presenter.onAlertButtonPressed();
		}
	}

	@UiHandler("confirm")
	protected void onConfirmButtonPressed(TapEvent event) {
		if (presenter != null) {
			presenter.onConfirmButtonPressed();
		}
	}

	@UiHandler("beep")
	protected void onBeepButtonPressed(TapEvent event) {
		if (presenter != null) {
			presenter.onBeepButtonPressed();
		}
	}

	@UiHandler("vibrate")
	protected void onVibrateButtonPressed(TapEvent event) {
		if (presenter != null) {
			presenter.onVibrateButtonPressed();
		}
	}

}