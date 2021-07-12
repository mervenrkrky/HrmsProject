package kodlamaio.hrms1.entities.concretes;

import java.util.Date;

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
import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_experiences")
public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="finish_date")
	@Nullable
	private Date finishDate;
	
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private CV cv;
	

}
