package com.example.Clothing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	int Prod_Id;
	int User_Id;
	int quantity;
}
