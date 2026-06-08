package in.kuldeep.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kuldeep.dto.ConsDTO;
import in.kuldeep.entity.Consultant;
import in.kuldeep.repository.ConsultantRepository;
import in.kuldeep.service.ConsultantService;

@Service
public class ConsultantServiceImpl implements ConsultantService{
	@Autowired 
	private ConsultantRepository consultantRepo;
	
	@Override
	public ConsDTO getConsultantById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Searching consultant id = " + id);
		List<Consultant> consultants =
                consultantRepo.findConsultantById(id);
		 System.out.println("Consultants = " + consultants);

	        if (!consultants.isEmpty()) {

	            Consultant cons = consultants.get(0);

	            ConsDTO dto = new ConsDTO();
	            dto.setId(cons.getId());
	            dto.setFirstName(cons.getFirstName());
	            dto.setLastName(cons.getLastName());
	            dto.setAge(cons.getAge());
	            dto.setClient(cons.getClient());

	            return dto;
	        }

	        throw new RuntimeException("Consultant Not Found");
	    
		
	}

}
