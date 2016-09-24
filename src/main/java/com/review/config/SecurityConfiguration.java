package com.review.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.social.security.SpringSocialConfigurer;



@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Resource
	private UserDetailsService userService;
    

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
        http
        .authorizeRequests()
            .antMatchers("/",
            		"/**").permitAll()
            .anyRequest().authenticated();
    
    http
        .formLogin()
            .loginPage("/signin")
            .permitAll().and()
    	.csrf().disable()
        .logout()
        	.logoutUrl("/logout")
            .deleteCookies("JSESSIONID")
            .permitAll().and()
        .apply(new SpringSocialConfigurer());
    	
    }
    
	@Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
        authManagerBuilder.userDetailsService(userService);
    }


}