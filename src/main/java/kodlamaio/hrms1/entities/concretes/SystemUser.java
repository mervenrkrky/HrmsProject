package kodlamaio.hrms1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="system_users")
@NoArgsConstructor
@AllArgsConstructor
public class SystemUser {
	
	
	@Id
	@GeneratedValue
	@Column(name="system_user_id")
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	
	
	

}
