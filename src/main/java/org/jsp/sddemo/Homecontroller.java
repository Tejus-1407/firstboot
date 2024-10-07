package org.jsp.sddemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	
	
	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi from Homecontroller");
		return "Hi from Home Controller";
	}

		@RequestMapping("/hello")
		public String hello() {
			System.out.println("Hello from Homecontrol");
			return "Hello from Home Controll";
		}
		
		
		@RequestMapping("/save")
		public Users save(@RequestBody Users user )
		{		
//
//			Users us =new Users();
//			System.out.println("user saved successfully");
			return user;
		}
		
		@RequestMapping("/login")
		public String login(@RequestParam String Username,@RequestParam String password) {
			
			System.out.println(Username);
			System.out.println(password);
			return "Login Successfull";	
		}
			
		
		@RequestMapping("/find")
		public person find(@RequestBody person p) {
			return p;
		}
				
		@RequestMapping("/findusers")
		public String findusers() {
			System.out.println("All users found succesfully");
			return "find all users succesfully";
			
		}
}
