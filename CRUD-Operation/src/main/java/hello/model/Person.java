package hello.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Configuration;

@Entity
@Configuration
public class Person implements Serializable{
	
	/*public Person(String personName) {
		this.personName = personName;
	}

	@SuppressWarnings("unused")
	private Person() {
		
	}*/
	/**
	 * 
	 */
	private static final long serialVersionUID = -7210408175119925154L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer personId;
	
	@Column
	private String personName;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
