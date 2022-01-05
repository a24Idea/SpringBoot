package org.a24learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping("welcome")
	public String welcome () {
		return "welcome";
	}

}
