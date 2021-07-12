package kodlamaio.hrms1.business.abstracts;

import java.util.List;

import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	DataResult<List<JobExperience>> getAll();
	
	DataResult<List<JobExperience>> getByCandidateIdSortByFinishDate(int candidateId,String direction);
	
	Result add(JobExperience jobExperience);
}
