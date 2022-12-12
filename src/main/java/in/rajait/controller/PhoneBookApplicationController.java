package in.rajait.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rajait.common.ApiResponse;
import in.rajait.model.Contact;
import in.rajait.service.PhoneBookApplicationService;

@RestController
@CrossOrigin
public class PhoneBookApplicationController {

	//@Autowired
	@Qualifier
	private PhoneBookApplicationService applicationService;
	
	@PostMapping("/plan")
	public ResponseEntity<String> savePlan(@RequestBody Contact contact) {
		String responseMsg = "";

		//boolean isSaved = planService.savePlan(plan);
	
		boolean saveContact = applicationService.saveContact(contact);

		if (saveContact) {
			responseMsg = "Contact is saved successfully...";
		} else {
			responseMsg = "Falied to save the contact...";
		}
		return new ResponseEntity<>(responseMsg, HttpStatus.CREATED);
	}
	@PostMapping("/create")
	public ResponseEntity<ApiResponse> createCategory(@RequestBody Contact contact) {
		//categoryService.createCategory(contact);
		applicationService.saveNewContact(contact);
		return new ResponseEntity<>(new ApiResponse(true, "A new Contact is created"),HttpStatus.CREATED);
	}
	
	@RequestMapping("/")
	public String welcome() {
		String msg="Welcome to SpringBoot Application";
		return msg;
	}
}
