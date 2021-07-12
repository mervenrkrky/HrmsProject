package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.JobExperienceService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms1.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		List<JobExperience> experiencegetall = this.jobExperienceDao.findAll();

		return new SuccessDataResult<List<JobExperience>>(experiencegetall, "Bütün veriler listelendi.");

	}

	@Override
	public DataResult<List<JobExperience>> getByCandidateIdSortByFinishDate(int candidateId, String direction) {
		Sort sort = Sort.by(Direction.fromString(direction), "finishDate");
		List<JobExperience> jobExperiences = this.jobExperienceDao.getByCandidate_Id(candidateId, sort);

		return new SuccessDataResult<List<JobExperience>>(jobExperiences,
				"Adayların iş tecrubeleri yıla göre sıralandı");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("İş tecrübesi sisteme eklendi.");
	}

}
