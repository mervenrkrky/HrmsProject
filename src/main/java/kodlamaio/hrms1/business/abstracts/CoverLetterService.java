package kodlamaio.hrms1.business.abstracts;

import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CoverLetter;

public interface CoverLetterService {
	
	Result add(CoverLetter coverLetter);

}
