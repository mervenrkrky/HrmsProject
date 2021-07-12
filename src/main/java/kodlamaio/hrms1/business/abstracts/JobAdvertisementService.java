package kodlamaio.hrms1.business.abstracts;

import java.util.List;

import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement job_advertisement);


	DataResult<List<JobAdvertisement>> getAllActiveAdvertisement();

	DataResult<List<JobAdvertisement>> getAllActiveAdvertisementSortByLastDate(String direction);

	DataResult<List<JobAdvertisement>> getAllActiveAdvertisementByEmployerId(int employerId);

	DataResult<List<JobAdvertisement>> getAll();
}