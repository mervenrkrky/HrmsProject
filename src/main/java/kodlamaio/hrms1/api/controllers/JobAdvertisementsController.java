/*package kodlamaio.hrms1.api.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.job_advertisementService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.job_advertisement;
import kodlamaio.hrms1.entities.concretes.job_position;
@RestController
@RequestMapping("/api/job_advertisementService")
public class job_advertisementController {
	
	private job_advertisementService job_advertisementservice;
	@Autowired
	public job_advertisementController(job_advertisementService job_advertisementservice) {
		super();
		this.job_advertisementservice=job_advertisementservice;
	}
	*/
/*@GetMapping("/add")
public Result add(job_advertisement job_advertisement) {
	return this.job_advertisementservice.add(job_advertisement);
}*/

/*
	@GetMapping("/getall")
	public DataResult<List<job_advertisement>> getAll(){
		return this.job_advertisementservice.getAll();
		
	}

	
	
	
	

}*/
package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;


/*
 * class isimleri -> PascalCase
 * metot, değişken ve nesne isimleri -> camelCase
 * */

@RestController
@RequestMapping("/api/job-advertisements")
public class JobAdvertisementsController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement job_advertisement) {
		return this.jobAdvertisementService.add(job_advertisement);
	}

	@GetMapping("getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();	}
	@GetMapping("/active-job-advertisements")
	public DataResult<List<JobAdvertisement>> getAllActiveAdvertisement() {
		return this.jobAdvertisementService.getAllActiveAdvertisement();
	}

	@GetMapping("/active-job-advertisement/sort-by-last-date")
	public DataResult<List<JobAdvertisement>> getAllActiveAdvertisementSortByLastDate(
			@RequestParam(defaultValue = "asc") String direction) {
		return this.jobAdvertisementService.getAllActiveAdvertisementSortByLastDate(direction);
	}
	
	@GetMapping("/active-job-advertisement/employer")
	public DataResult<List<JobAdvertisement>> getAllActiveAdvertisementByEmployerId(@RequestParam() int employerId){
		return this.jobAdvertisementService.getAllActiveAdvertisementByEmployerId(employerId);
		
	}

}
