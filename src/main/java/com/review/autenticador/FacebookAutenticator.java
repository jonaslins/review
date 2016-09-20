package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Component;

@Component
public class FacebookAutenticator {
	
	@Autowired
	private Facebook facebook;
	@Autowired
    private ConnectionRepository connectionRepository;

	public User signInWithFacebook(){
		User user = facebook.userOperations().getUserProfile();
		return user;
	}

}
