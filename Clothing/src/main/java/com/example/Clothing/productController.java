package com.example.Clothing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
	@GetMapping("/getProd")
	public Product getProd() {
		Product a=new Product();
		a.setProd_Id(1);
		a.setProd_Name("Nike Running Shoes");
		a.setProd_Type("FootWear");
		a.setProd_Price(2000f);
		a.setProd_Brand("Nike");
		a.setProd_Category("Men");
		a.setProd_Stock(300);
		return a;
	}
}
