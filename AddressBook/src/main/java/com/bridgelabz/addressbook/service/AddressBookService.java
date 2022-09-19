package com.bridgelabz.addressbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
@Service
public class AddressBookService implements IAddressBookService{
	@Autowired
	AddressBookRepository addressRepository;

	@Override
	public AddressBookModel addAddressBook(AddressDTO addressdto) {
		AddressBookModel model = new AddressBookModel(addressdto);
		addressRepository.save(model);
		return model;
	}		
}
