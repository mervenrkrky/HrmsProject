package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.JobPositionService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPosition")
public class JobPositionsController {
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
		
	}

}
