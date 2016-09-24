package com.review.model.cadastro;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Service;

import com.review.model.entidade.Usuario;
import com.review.model.repositorio.RepositorioUsuarioBDR;
import com.review.util.UserDetailsImpl;

@Service
@Transactional
public class CadastroUsuario implements UserDetailsService, SocialUserDetailsService{
	
	@Autowired
	private RepositorioUsuarioBDR userRepository;

	public Usuario buscar(Usuario usuario) {
		return userRepository.findByEmail(usuario.getEmail());
	}

	public void cadastrar(Usuario usuario) {
		userRepository.save(usuario);	
	}

	
	@Override
	public SocialUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = userRepository.findByEmail(username);
		return new UserDetailsImpl(usuario);		
	}

    @Override
    public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException, DataAccessException {
    	return loadUserByUsername(userId);
    }


}
