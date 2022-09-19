package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;

public interface IAddressBookService {

	AddressBookModel addAddressBook(AddressDTO addressdto);

}
