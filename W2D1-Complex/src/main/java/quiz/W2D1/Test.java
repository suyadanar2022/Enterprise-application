package quiz.W2D1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Test {
	
	@Id
	@GeneratedValue
	private Long id;
	
//	@OneToMany //(mappedBy = "testVar")
//	private List<Enrollment> enrollList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public List<Enrollment> getEnrollList() {
//		return enrollList;
//	}

//	public void setEnrollList(List<Enrollment> enrollList) {
//		this.enrollList = enrollList;
//	}

	
	
}
