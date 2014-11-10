package com.tidecc.protobuf.example;

import com.example.tutorial.AddressBookProtos.AddressBook;
import com.example.tutorial.AddressBookProtos.Person;

public class EchoPerson {
	
	public void printPerson(){
		Person.Builder person = Person.newBuilder();
		person.setName("张三");
		
	}

}
