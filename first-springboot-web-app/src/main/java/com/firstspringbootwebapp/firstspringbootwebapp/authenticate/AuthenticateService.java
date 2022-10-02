package com.firstspringbootwebapp.firstspringbootwebapp.authenticate;

import org.springframework.stereotype.Component;

//@Service
@Component // we can use either @Service or @Component
public class AuthenticateService {

	public boolean authenticateCredentials(String name, String password) {
		boolean isValidUsername = name.equalsIgnoreCase("name");
		boolean isValidPassword = password.equalsIgnoreCase("123");

		return isValidUsername && isValidPassword;
	}

}
