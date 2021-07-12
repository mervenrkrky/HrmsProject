package kodlamaio.hrms1.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.CoverLetterService;
import kodlamaio.hrms1.core.utilities.result.ErrorDataResult;
import kodlamaio.hrms1.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletter")

public class CoverLettersController {
	private CoverLetterService coverLetterService;
	@Autowired
	public CoverLettersController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody CoverLetter coverLetter) {
		return ResponseEntity.ok(this.coverLetterService.add(coverLetter));

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handlerValidcepionException(MethodArgumentNotValidException exceptions) {
		Map<String, String> validationErrors = new HashMap<String, String>();
		for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}

		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Dogrulama hataları");

		return errors;
	}
	

}
