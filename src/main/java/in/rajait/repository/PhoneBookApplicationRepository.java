package in.rajait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rajait.model.Contact;

@Repository

public interface PhoneBookApplicationRepository extends JpaRepository<Contact, Integer>{

}
