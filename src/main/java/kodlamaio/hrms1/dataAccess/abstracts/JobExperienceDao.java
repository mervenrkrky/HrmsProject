package kodlamaio.hrms1.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms1.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

	List<JobExperience> getByCandidate_Id(int candidateId);

	List<JobExperience> getByCandidate_Id(int candidateId, Sort sort);
}
