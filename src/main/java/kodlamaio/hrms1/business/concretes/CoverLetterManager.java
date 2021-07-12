package kodlamaio.hrms1.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.CoverLetterService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.CoverLetterDao;
import kodlamaio.hrms1.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{

	private CoverLetterDao coverLetterDao;
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		
		return new SuccessResult("Ön yazınız eklendi.");
	}
	
	

}
