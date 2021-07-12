package kodlamaio.hrms1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.hrms1.entities.concretes.Candidate;

public interface CandidateDao  extends JpaRepository<Candidate, Integer>{

	
	

}
