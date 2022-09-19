package com.bridgelabz.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class Controller {
	@Autowired
	IAddressBookService addressBookService;
	
	@PostMapping("/addaddressbook")
	public AddressBookModel addAddressBook(@RequestBody AddressDTO addressdto) {
		return addressBookService.addAddressBook(addressdto);
	}
}
