package kodlamaio.hrms1.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms1.entities.concretes.CV;
public interface CVDao extends JpaRepository<CV, Integer>{
	//List<CV> getByEmployer_IdByCv(int employerId);
	
	List<CV> getByCandidate_Id(int candidate);

}
