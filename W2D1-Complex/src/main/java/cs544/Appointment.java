package cs544;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//@Entity
public class Appointment {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	 private Long id;
	@Column(name = "APPDATE")
	 private String appdate;
	@OneToOne
	@JoinColumn(name = "PATIENT")
	 private Patient patient;
	@Embedded
	 private Payment payment;
	@ManyToOne
	@JoinColumn(name = "DOCTOR")
	 private Doctor doctor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppdate() {
		return appdate;
	}
	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	
	
}
