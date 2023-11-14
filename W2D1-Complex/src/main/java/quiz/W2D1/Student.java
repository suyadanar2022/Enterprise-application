package quiz.W2D1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student{
	@Id
	@GeneratedValue
	@Column(name="studentId")
	private Long id;
	private String name;
	private int age;
	@OneToMany
	private List<Enrollment> Courses;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Enrollment> getCourses() {
		return Courses;
	}
	public void setCourses(List<Enrollment> courses) {
		Courses = courses;
	}
	
	
}