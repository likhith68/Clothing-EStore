package com.example.Clothing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	String Prod_Name;
	int Prod_Id;
	String Prod_Type;
	String Prod_Category;
	int Prod_Stock;
	String Prod_Brand;
	float Prod_Price;
}
