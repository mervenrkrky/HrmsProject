package kodlamaio.hrms1.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms1.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	/*method overloading*/
	List<JobAdvertisement> getByStatus(boolean status);

	List<JobAdvertisement> getByStatus(boolean status, Sort sort);//sort=sıralamak
	
	List<JobAdvertisement> getByEmployer_IdAndStatus(int employerId, boolean status);
	
}
