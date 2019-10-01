package com.sis.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.sis.model.UserModel;
import com.sis.repository.UserRepository;

/**
 * @author: Alim Khowaja
 * UserDetailsServiceImpl.java used to
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    @Autowired
    private UserRepository userRepository;

    /**
     * load Userdetail by username and send username and password to spring security 
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
	// statically defined username and password for JWT(JSON web Token)
	UserModel userModel = new UserModel();
	userModel.setUsername("y");
	userModel.setPassword("$2a$10$tts4URO/6U0WMKwDRCkOhugJbOL9WtF1m8mnlFCoU9Yq/ES2PkLQG");
	return new org.springframework.security.core.userdetails.User(userModel.getUsername(), userModel.getPassword(),
		new ArrayList<>());
    }

}
