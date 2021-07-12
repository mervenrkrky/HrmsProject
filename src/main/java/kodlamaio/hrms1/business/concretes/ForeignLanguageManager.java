package kodlamaio.hrms1.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.ForeignLanguageDao;
import kodlamaio.hrms1.entities.concretes.ForeignLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {

	// dependency injection
	private ForeignLanguageDao foreignLanguageDao;

	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult("yanbancı dil bilginiz eklendi.");
	}

}
