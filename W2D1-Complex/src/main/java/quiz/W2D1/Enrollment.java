package quiz.W2D1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Grades")
public class Enrollment {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 3)
	private String grade;
	@ManyToOne
	private Student student;
	@ManyToOne
	private Course course;
	
//	@ManyToOne
	@OneToOne
	@PrimaryKeyJoinColumn
	private Test testVar;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Test getTestVar() {
		return testVar;
	}
	public void setTestVar(Test testVar) {
		this.testVar = testVar;
	}

	
	
}