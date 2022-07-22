package com.example.Clothing;

import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	int User_Id;
	int Cart_Id;
	String User_Name;
	String User_Email;
	String Phone_Number;
	String User_password;
	String User_type;
	LinkedList<Address> address;
}
