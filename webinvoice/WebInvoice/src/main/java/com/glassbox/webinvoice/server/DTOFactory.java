package com.glassbox.webinvoice.server;

import org.springframework.stereotype.Service;

import com.glassbox.webinvoice.shared.DTOentity.AddressDTO;
import com.glassbox.webinvoice.shared.DTOentity.AutonumDTO;
import com.glassbox.webinvoice.shared.DTOentity.EmailDTO;
import com.glassbox.webinvoice.shared.DTOentity.PersonDTO;
import com.glassbox.webinvoice.shared.DTOentity.RoleDTO;
import com.glassbox.webinvoice.shared.DTOentity.StateDTO;
import com.glassbox.webinvoice.shared.DTOentity.SuburbDTO;
import com.glassbox.webinvoice.shared.entity.Address;
import com.glassbox.webinvoice.shared.entity.AuState;
import com.glassbox.webinvoice.shared.entity.Autonum;
import com.glassbox.webinvoice.shared.entity.Email;
import com.glassbox.webinvoice.shared.entity.Person;
import com.glassbox.webinvoice.shared.entity.Role;
import com.glassbox.webinvoice.shared.entity.State;
import com.glassbox.webinvoice.shared.entity.Suburb;

@Service
public class DTOFactory {

	public PersonDTO toDTO(Person person) {
		PersonDTO personDTO = new PersonDTO();//
		personDTO.setFirstname(person.getFirstname());
		personDTO.setLastname(person.getLastname());
		personDTO.setRole(toDTO(person.getRole()));
		personDTO.setLogintime(person.getLogintime());
		for (Email e : person.getEmails())
			personDTO.getEmails().add(toDTO(e, personDTO));
		for (Address a : person.getAddresses())
			personDTO.getAddresses().add(toDTO(a, personDTO));
		for (Autonum a : person.getUserAutonums())
			personDTO.getUserAutonums().add(
					toDTO(a, toDTOWithouAutonum(a.getClient()),
							toDTOWithouAutonum(a.getUser())));
		return personDTO;
	}

	private PersonDTO toDTOWithouAutonum(Person person) {
		PersonDTO personDTO = new PersonDTO();//
		personDTO.setFirstname(person.getFirstname());
		personDTO.setLastname(person.getLastname());
		personDTO.setLogintime(person.getLogintime());
		personDTO.setRole(toDTO(person.getRole()));
		for (Email e : person.getEmails())
			personDTO.getEmails().add(toDTO(e, personDTO));
		for (Address a : person.getAddresses())
			personDTO.getAddresses().add(toDTO(a, personDTO));

		return personDTO;
	}

	public SuburbDTO toDTO(Suburb suburb) {
		SuburbDTO suburbDTO = new SuburbDTO();
		suburbDTO.setId(suburb.getId());
		suburbDTO.setPostcode(suburb.getPostcode());
		suburbDTO.setSuburb(suburb.getSuburb());
		return suburbDTO;
	}

	public StateDTO toDTO(State state) {
		StateDTO stateDTO = new StateDTO();
		stateDTO.setId(state.getId());
		stateDTO.setName(state.getName());
		return stateDTO;
	}

	public RoleDTO toDTO(Role role) {
		RoleDTO roleDTO = new RoleDTO();
		roleDTO.setId(role.getId());
		roleDTO.setName(role.getName());
		return roleDTO;
	}

	public EmailDTO toDTO(Email email, PersonDTO personDTO) {
		EmailDTO emailDTO = new EmailDTO();
		emailDTO.setEmailAddress(email.getEmailAddress());
		emailDTO.setId(email.getId());
		emailDTO.setPerson(personDTO);
		return emailDTO;

	}

	public AutonumDTO toDTO(Autonum autonum, PersonDTO clientDTO,
			PersonDTO userDTO) {
		AutonumDTO autonumDTO = new AutonumDTO();
		autonumDTO.setId(autonum.getId());
		autonumDTO.setNumber(autonum.getNumber());
		autonumDTO.setPrefix(autonum.getPrefix());
		autonumDTO.setSuffix(autonum.getSuffix());

		autonumDTO.setClient(clientDTO);
		autonumDTO.setUser(userDTO);
		return autonumDTO;
	}

	public AddressDTO toDTO(Address address, PersonDTO person) {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setId(address.getId());
		addressDTO.setState(toDTO(address.getState()));
		addressDTO.setSuburb(toDTO(address.getSuburb()));
		addressDTO.setPerson(person);
		return addressDTO;
	}

}
