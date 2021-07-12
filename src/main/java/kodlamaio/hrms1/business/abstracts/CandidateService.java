package kodlamaio.hrms1.business.abstracts;

import java.util.List;

import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();

	Result add(Candidate candidate);

}
