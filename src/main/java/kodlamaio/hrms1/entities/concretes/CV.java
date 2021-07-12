package kodlamaio.hrms1.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cv")
public class CV {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToMany(mappedBy = "cv")
	@JsonProperty(access = Access.READ_ONLY)
	private List<CandidateSchool> candidateSchool;

	@OneToMany(mappedBy = "cv")
	@JsonProperty(access = Access.READ_ONLY)
	private List<CandidatesSocialLink> candidatesSocialLink;

	@OneToMany(mappedBy = "cv")
	@JsonProperty(access = Access.READ_ONLY)
	private List<CoverLetter> coverLetter;

	@OneToMany(mappedBy = "cv")
	@JsonProperty(access = Access.READ_ONLY)
	private List<ForeignLanguage> foreignLanguage;

	@OneToMany(mappedBy = "cv")
	@JsonProperty(access = Access.READ_ONLY)
	private List<JobExperience> JobExperience;

	@OneToMany(mappedBy = "cv")
	@JsonProperty(access = Access.READ_ONLY)
	private List<ProgrammingLanguage> programmingLanguage;

	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	


}
