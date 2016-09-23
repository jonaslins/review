package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;
import com.review.util.UserDetailsImpl;

@Component
public class FacebookAutenticator {
	
	@Autowired
	private Facebook facebook;
	@Autowired
	private ProviderSignInUtils providerSignInUtils;

	public User signInWithFacebook(WebRequest request){
		
		Connection<?> connection = providerSignInUtils.getConnectionFromSession(request);
        UserProfile profile = connection.fetchUserProfile();
        
        
        Usuario usuario = new Usuario(profile.getName(), profile.getEmail());
        UserDetailsImpl userDetails = new UserDetailsImpl(usuario);
        
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        providerSignInUtils.doPostSignUp(usuario.getEmail(), request);		
		
        User user = null;
        if(facebook.isAuthorized()){
        	user = facebook.userOperations().getUserProfile();
        }
		
		return user;
	}

}
