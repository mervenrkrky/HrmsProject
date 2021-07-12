package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.EmployerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.Employer;


@RestController
@RequestMapping("/api/employer")
public class EmployersConrtollers {
	
	private EmployerService employerService;

	@Autowired
	public EmployersConrtollers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
		}

}
