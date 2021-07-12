package kodlamaio.hrms1.business.abstracts;

import java.util.List;

import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.SystemUser;

public interface SystemUserService {
	
	DataResult<List<SystemUser>> getAll();

}
