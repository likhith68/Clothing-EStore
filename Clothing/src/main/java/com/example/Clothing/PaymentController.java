package com.example.Clothing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@GetMapping("/getPay")
	public Payment getPay() {
		Payment p=new Payment();
		p.setPay_Id(1);
		p.setPay_Mode("cash");
		p.setCard_Details("Upi Details...");
		p.setPay_Status("Should Pay Cash on Delivery");
		return p;
	}
}
