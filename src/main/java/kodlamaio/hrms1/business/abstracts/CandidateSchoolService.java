package kodlamaio.hrms1.business.abstracts;

import java.util.List;

import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CandidateSchool;

public interface CandidateSchoolService {
	DataResult<List<CandidateSchool>> getAll();
	
	DataResult<List<CandidateSchool>> getByCandidateIdSortByFinishDate(int candidateId,String direction);
	
	Result add(CandidateSchool candidateSchool);
	

}
