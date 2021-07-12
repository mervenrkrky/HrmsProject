package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.SystemUserService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.dataAccess.abstracts.SystemUserDao;
import kodlamaio.hrms1.entities.concretes.SystemUser;
@Service
public class SystemUserManager implements SystemUserService{

	private SystemUserDao systemUserDao;
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {

		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public DataResult<List<SystemUser>> getAll() {
		
		return new SuccessDataResult<List<SystemUser>>(this.systemUserDao.findAll(), "Data Listelendi");
				
	}

}
