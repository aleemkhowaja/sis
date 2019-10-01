package com.sis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sis.config.JwtTokenUtil;
import com.sis.model.JwtRequest;
import com.sis.model.JwtResponse;
import com.sis.service.UserDetailsServiceImpl;

/**
 * 
 * 
 * @author: Alim Khowaja
 *
 * JwtAuthenticationController.java used to Authenticate username and password and generate token
 */
@RestController
@CrossOrigin
public class JwtAuthenticationController
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping(path = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception
    {
	authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
	final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
	final String token = jwtTokenUtil.generateToken(userDetails);
	return ResponseEntity.ok(new JwtResponse(token));
    }

    /**
     * authenticate username and password
     * @param username
     * @param password
     * @throws Exception
     */
    private void authenticate(String username, String password) throws Exception
    {
	try
	{
	    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
	}
	catch(DisabledException e)
	{
	    throw new Exception("USER_DISABLED", e);
	}
	catch(BadCredentialsException e)
	{
	    throw new Exception("INVALID_CREDENTIALS", e);
	}
    }
}
