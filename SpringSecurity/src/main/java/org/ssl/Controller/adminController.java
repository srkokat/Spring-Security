package org.ssl.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ssl")
public class adminController {

	@GetMapping("/getUser")
	public String getUser() {
		return "Hello! User";
	}
	
}
	 