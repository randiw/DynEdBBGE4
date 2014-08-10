package com.randi.dyned4.view;

import com.randi.dyned4.view.manager.RegisterManager;

public class RegisterScreen extends BasicScreen {

	public RegisterScreen() {
		super("Register");
		add(new RegisterManager());
	}
}