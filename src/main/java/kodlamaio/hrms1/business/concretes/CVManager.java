package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.CVService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.CVDao;
import kodlamaio.hrms1.entities.concretes.CV;

@Service
public class CVManager implements CVService {

	private CVDao cvDao;

	@Autowired
	public CVManager(CVDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<CV>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CV>>(this.cvDao.getByCandidate_Id(candidateId), "Data Listelendi");

	}

	@Override
	public Result add(CV cv) {
		this.cvDao.save(cv);
		return new SuccessResult("cv kullanıcıya tanımlandı.");
	}



}
