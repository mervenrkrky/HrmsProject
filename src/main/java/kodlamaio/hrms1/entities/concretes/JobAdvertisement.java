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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="job_description")
	private String jobDescription;
	
	
	@Column(name="salary_min")
	private int salaryMin;
	
	
	@Column(name="salary_max")
	private int salaryMax;
	
	
	@Column(name="position_number")
	private int positionNumber;
	
	
	@Column(name="last_date")
	private Date lastDate;
	
	@Column(name="relase_date")
	private Date relaseDate;
	
	
	@Column(name="status")
	private Boolean status;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition job_positions;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City cities;

	

}
