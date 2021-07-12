package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.CandidateService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesControllers {

	private CandidateService candidateService;

	@Autowired
	public CandidatesControllers(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}

}
