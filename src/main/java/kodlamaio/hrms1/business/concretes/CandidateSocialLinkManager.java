package kodlamaio.hrms1.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.CandidateSocialLinkService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.CandidatesSocialLinkDao;
import kodlamaio.hrms1.entities.concretes.CandidatesSocialLink;

@Service
public class CandidateSocialLinkManager implements CandidateSocialLinkService{

	CandidatesSocialLinkDao candidatesSocialLinkDao;
	@Autowired
	public CandidateSocialLinkManager(CandidatesSocialLinkDao candidatesSocialLinkDao) {
		super();
		this.candidatesSocialLinkDao = candidatesSocialLinkDao;
	}

	@Override
	public Result add(CandidatesSocialLink candidatesSocialLink) {
		this.candidatesSocialLinkDao.save(candidatesSocialLink);
		return new SuccessResult("sosyal medya bilgisi eklendi");
	}

	

	
}
