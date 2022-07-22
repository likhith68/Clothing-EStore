package com.example.Clothing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	@GetMapping("/getCart")
	public Cart getCart() {
		Cart c=new Cart();
		c.setProd_Id(123);
		c.setUser_Id(1);
		c.setQuantity(5);
		return c;
	}
}
