package edu.mum.cs544;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight {
	@Id
	@GeneratedValue
	private Long id;
	private String flightNo;
	
	@Column(name = "from_city")
	private String from;
	@Column(name = "to_city")
	private String to;
	
	@Temporal(TemporalType.TIME)
	private Date date;

	
	
	public Flight() {
		
	}
	
	public Flight(String flightNo, String from, String to, Date date) {
		
		this.flightNo = flightNo;
		this.from = from;
		this.to = to;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
