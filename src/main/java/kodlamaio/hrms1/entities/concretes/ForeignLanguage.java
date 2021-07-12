package kodlamaio.hrms1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "foreign_languages")
public class ForeignLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Min(value = 1)
	@Max(value = 5)
	@Column(name = "level")
	private int level;

	@Column(name = "language")
	@NotNull
	@NotBlank
	private String language;

	/*@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;*/
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	//@JsonProperty(access = Access.WRITE_ONLY)
	private CV cv;

}
