package com.yoonshop.shop.utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator{
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {

		return new PasswordAuthentication("dyjung2073@gmail.com", GooglePassword.GOOGLEPASSWORD());
	}
}