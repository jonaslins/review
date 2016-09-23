package com.review.util;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.facebook.api.User;
import org.springframework.social.security.SocialUserDetails;

import com.review.model.entidade.Usuario;

public class UserDetailsImpl implements SocialUserDetails {
	
	private static final long serialVersionUID = 5197941260523577515L;
	
	private Usuario user;
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public UserDetailsImpl(Usuario user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>(1);
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		return authorities;
		
	}


	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getUserId() {
		return getUsername();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}