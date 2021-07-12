package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.EmployerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms1.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listelendi");
		
	
				
				
	}

}
