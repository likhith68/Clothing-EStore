package com.example.Clothing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@GetMapping("/getOrder")
	public Order getOrder() {
		Order o=new Order();
		o.setOrder_Id(1);
		o.setOrder_Date("21st July 2022");
		o.setOrder_Status("Packed and Sent for Delivery");
		
		Address a1=new Address();
		a1.setCity("Hyderabad");
		a1.setState("Telangana");
		a1.setHouseNumber("4");
		a1.setLandMark("PVR Sri Sai Hills");
		a1.setPinCode("500047");
		o.setOrder_Address(a1);
		
		Address a2=new Address();
		a2.setCity("Hyderabad");
		a2.setState("Telangana");
		a2.setHouseNumber("Block 2");
		a2.setLandMark("Amazon Godown");
		a2.setPinCode("500071");
		o.setShipping_Address(a2);
		
		return o;
	}
}
