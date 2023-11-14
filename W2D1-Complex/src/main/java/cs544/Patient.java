package cs544;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;

//@Entity
@SecondaryTable(name = "Address")
public class Patient {
	
	@Id
	@GeneratedValue
	 private Long id;
	@Column(name = "NAME")
	 private String name;
	
	 @Column(name = "STREET",table = "Address")
	 private String street;
	 
	 @Column(name = "ZIP",table = "Address")
	 private String zip;
	 
	 @Column(name = "CITY",table = "Address")
	 private String city;
	 
	 public Patient() {
	
	}

	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	 
	 
}
