package kodlamaio.hrms1.business.abstracts;

import java.util.List;

import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CV;

public interface CVService {

	Result add(CV cv);
	DataResult<List<CV>> getByCandidateId(int candidateId);

}
