package com.example.Clothing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	int Pay_Id;
	String Pay_Mode;
	String Card_Details;
	String Pay_Status;
}
