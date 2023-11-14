package quiz.W2D1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Column(name = "dep", length = 2)
	private String department;
	private int number;
	@OneToMany(mappedBy = "course")
	private List<Enrollment> students;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<Enrollment> getStudents() {
		return students;
	}
	public void setStudents(List<Enrollment> students) {
		this.students = students;
	}
	
	
	
}
