package in.kuldeep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.kuldeep.dto.ConsDTO;
import in.kuldeep.response.ApiResponse;
import in.kuldeep.service.ConsultantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/pending")
@Tag(name = "Consultant API", description = "Operations related to consultants")
public class KuldeepRestController {
	
	@Autowired
	ConsultantService consService;
	
	@GetMapping("/{id}")
    @Operation(summary = "Get Consultant By Id")
	public ResponseEntity<ApiResponse<ConsDTO>> getConsultantById(@PathVariable Integer id) {
		ConsDTO dto = consService.getConsultantById(id);
		System.out.println("dto ..!! "+dto);
		if (dto == null) {
	        return ResponseEntity.notFound().build();
	    }
	    ApiResponse<ConsDTO> response =
	            new ApiResponse<>("Success", dto);
	    return ResponseEntity.ok(response);
	}
	/*
	@GetMapping("/{id}")
	public String sayHello () {
		return "Haaluu Kuldeep!";
	}
	*/
}

