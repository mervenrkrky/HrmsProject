package kodlamaio.hrms1.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.ProgremmingLanguageService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlamaio.hrms1.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgremmingLanguageService{
	private ProgrammingLanguageDao programmingLanguageDao;
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguageDao) {
		super();
		this.programmingLanguageDao = programmingLanguageDao;
	}
	@Override
	public Result add(ProgrammingLanguage programmingLanguage) {
	
		this.programmingLanguageDao.save(programmingLanguage);
		return new SuccessResult("Peogramlama diliniz sisteme eklendi");
	}
	

}
