package kodlamaio.hrms1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms1.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageDao extends JpaRepository<ProgrammingLanguage, Integer>{


}
