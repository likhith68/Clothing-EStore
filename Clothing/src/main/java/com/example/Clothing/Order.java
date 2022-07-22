package com.example.Clothing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	int Order_Id;
	String Order_Date;
	String Order_Status;
	Address Shipping_Address;
	Address Order_Address;
}
