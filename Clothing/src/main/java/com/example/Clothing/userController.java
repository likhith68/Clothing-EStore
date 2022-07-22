package com.example.Clothing;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	@GetMapping("/getUser")
	public User getUser() {
		User a=new User();
		a.setUser_Id(1);
		a.setUser_Name("Likhith");
		a.setUser_Email("Likhithjsc@gmail.com");
		a.setUser_password("1234Likhith");
		a.setUser_type("Admin");
		a.setPhone_Number("9010129906");
		a.setCart_Id(1);
		
		
		LinkedList<Address> address=new LinkedList<Address>();
		
		for(int i=0;i<2;i++) {
			Address a1=new Address();
			a1.setCity("Hyderabad");
			a1.setState("Telangana");
			a1.setHouseNumber("4");
			a1.setLandMark("PVR Sri Sai Hills");
			a1.setPinCode("500047");
			address.add(a1);
			a.setAddress(address);
		}
		return a;
	}
}
