package in.rajait.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.rajait.model.Contact;
import in.rajait.repository.PhoneBookApplicationRepository;


public class PhoneBookApplicationServiceImpl implements PhoneBookApplicationService{
	//@Autowired
	@Qualifier
	private PhoneBookApplicationRepository phoneBookApplicationRepository;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		Contact save = phoneBookApplicationRepository.save(contact);
		
		return save.getContactId()!=null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getConactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNewContact(Contact contact) {
		
		phoneBookApplicationRepository.save(contact);
	}

}
