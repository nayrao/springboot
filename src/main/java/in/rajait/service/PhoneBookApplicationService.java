package in.rajait.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.rajait.model.Contact;

@Service
public interface PhoneBookApplicationService {
	
	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getConactById(Integer contactId);
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);

	public void saveNewContact(Contact contact);

}
