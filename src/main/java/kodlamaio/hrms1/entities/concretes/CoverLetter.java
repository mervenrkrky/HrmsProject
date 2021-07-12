package kodlamaio.hrms1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cover_letter")
public class CoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="letter")
	private String letter;
	/*@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;*/
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private CV cv;


}
