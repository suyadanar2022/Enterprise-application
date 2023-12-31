package cs544;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	 private Long id;
	
	@Column(name = "TYPE")
	 private String doctortype;
	
	@Column(name = "FIRSTNAME")
	 private String firstname;
	
	@Column(name = "LASTNAME")
	 private String lastname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctortype() {
		return doctortype;
	}

	public void setDoctortype(String doctortype) {
		this.doctortype = doctortype;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
}
