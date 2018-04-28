package hello.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7210408175119925154L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String personId;
	
	@Column
	private String personName;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
