package kodlamaio.hrms1.entities.concretes;

import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidates")
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber; 
	
	@Column(name="birth_date")
	private Date birthDate;
	
	/*@ManyToOne()
	@JoinColumn(name="cv_id")
	@JsonIgnore
	private CV cv;*/
	
/*	@ManyToOne()
	@JoinColumn(name="cv_id")
	@JsonIgnore
	private CV cv;
*/
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<CV> cv;
	
}
