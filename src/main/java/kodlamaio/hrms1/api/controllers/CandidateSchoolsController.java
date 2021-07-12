package kodlamaio.hrms1.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.CandidateSchoolService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.ErrorDataResult;
import kodlamaio.hrms1.entities.concretes.CandidateSchool;
//import kodlamaio.hrms1.core.utilities.result.ErrorDataResult

@RequestMapping("/api/candidate-schools")
@RestController
public class CandidateSchoolsController {

	private CandidateSchoolService candidateSchoolService;

	@Autowired
	public CandidateSchoolsController(CandidateSchoolService candidateSchoolService) {
		super();
		this.candidateSchoolService = candidateSchoolService;
	}
	@GetMapping("/getall")
	public DataResult<List<CandidateSchool>> getAll(){
		return this.candidateSchoolService.getAll();
		
	}
	@GetMapping("/getByCandidateIdSortByFinishDate")
	public DataResult<List<CandidateSchool>> getByCandidateIdSortByFinishDate(@RequestParam int candidateId,@RequestParam(defaultValue = "asc") String direction){
		return this.candidateSchoolService.getByCandidateIdSortByFinishDate(candidateId,direction);
		
	}
	
	/*@PostMapping("/add")
	public Result add(@RequestBody CandidateSchool candidateSchool) {
		return this.candidateSchoolService.add(candidateSchool);
		
	}*/

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody CandidateSchool candidateSchool) {
		return ResponseEntity.ok(this.candidateSchoolService.add(candidateSchool));

	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handlerValidcepionException(MethodArgumentNotValidException exceptions){
		Map<String ,String>validationErrors=new HashMap<String, String>();
		for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
	
		ErrorDataResult<Object> errors= new  ErrorDataResult<Object>(validationErrors,"Dogrulama hataları");
	
		return errors;
	}
	

}
