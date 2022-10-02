package com.firstspringbootwebapp.firstspringbootwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.firstspringbootwebapp.firstspringbootwebapp.authenticate.AuthenticateService;

@Controller
public class LoginController {

//	using model to link the controller and the view.
//	the "name", will have the saved value which we have got 
//	from the browser, and now it can be used in the jsp page, 
//	using EL (expression language).

	@Autowired
	AuthenticateService authenticateService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage() {
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLoginForm(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticateService.authenticateCredentials(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		} else {
			model.put("incorrect", "You have entered incorrect credentials!");
			return "loginForm";
		}
	}
}
