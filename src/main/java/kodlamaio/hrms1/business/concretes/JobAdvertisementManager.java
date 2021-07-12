package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement job_advertisement) {
		this.jobAdvertisementDao.save(job_advertisement);
		return new SuccessResult("İş ilanı eklendi");
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Data listelendi");
		
	
				
				
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveAdvertisement() {

		List<JobAdvertisement> activeJobs = this.jobAdvertisementDao.getByStatus(true);
		return new SuccessDataResult<List<JobAdvertisement>>(activeJobs, "iş ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveAdvertisementByEmployerId(int employerId) {
		List<JobAdvertisement> sortedAdvertisement = this.jobAdvertisementDao.getByEmployer_IdAndStatus(employerId, true);
		return new SuccessDataResult<List<JobAdvertisement>>(sortedAdvertisement, "firmaya ait iş ilanlari listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveAdvertisementSortByLastDate(String direction) {
		Sort sort = Sort.by(Direction.fromString(direction), "lastDate");
		List<JobAdvertisement> sortedAdvertisement = this.jobAdvertisementDao.getByStatus(true, sort);
		return new SuccessDataResult<List<JobAdvertisement>>(sortedAdvertisement, "iş ilanlari tarihe göre sıralandı");
	}
	

}
