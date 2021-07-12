package kodlamaio.hrms1.business.abstracts;

import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {

	Result add(ForeignLanguage foreignLanguage);
}
