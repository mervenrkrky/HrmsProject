package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.CVService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CV;

@RestController
@RequestMapping("/api/CV")

public class CvsController {

	private CVService cvService;

	@Autowired
	public CvsController(CVService cvService) {
		super();
		this.cvService = cvService;
	}

	@GetMapping("/getByCandidateId")
	public DataResult<List<CV>> getByCandidateId(@RequestParam int candidateId) {
		return this.cvService.getByCandidateId(candidateId);
	}

	@PostMapping("/add")
	public Result add(@RequestBody CV cv) {
		return this.cvService.add(cv);
	}
}
