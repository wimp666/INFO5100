import java.util.*;

public class Course {
	private int courseId;
	private String courseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds;
	
	private int pointer = 0;
	
	public Course(int courseId) {
		this.courseId = courseId;
	}
	public Course(int courseId, int professorId) {
		this.courseId = courseId;
		this.professorId = professorId;
	}
	public Course(int courseId, int professorId, int credits) {
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credits;
	}
	
	public void setCourseId(int courseId) {
		if(courseId < 0) {
			System.out.println("Invalid value of courseId !");
			return;
		}
		this.courseId = courseId;
	}
	public int getCourseId() {
		return this.courseId;
	}
	
	public void setCourseName(String courseName) {
		if(courseName.length() < 10 || courseName.length() > 60) {
			System.out.println("Invalid value of courseName !");
			return;
		}
		this.courseName = courseName;
	}
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setMaxCapacity(int maxCapacity) {
		if(maxCapacity < 10 || maxCapacity > 100) {
			System.out.println("Invalid value of maxCapacity !");
			return;
		}
		this.maxCapacity = maxCapacity;
	}
	public int getMaxCapacity() {
		return this.maxCapacity;
	}
	
	public void setProfessorId(int professorId) {
		if(professorId < 100000 || professorId > 999999) {
			System.out.println("Invalid value of professorId !");
			return;
		}
		this.professorId = professorId;
	}
	public int getProfessorIdd() {
		return this.professorId;
	}
	
	public void setCredits(int credits) {
		if(credits < 0 || credits > 9) {
			System.out.println("Invalid value of credits !");
			return;
		}
		this.credits = credits;
	}
	public int getCredits() {
		return this.credits;
	}
	
	public void registerStudent(int studentId) {
		this.studentIds = new int[maxCapacity];
		studentIds[pointer++] = studentId;	
	}
	
	//Q3
	public int[] removeDuplicates(int[] studentIds) {
		Set<Integer> hash = new HashSet<>();
		for(int i : studentIds) {
			hash.add(i);
		}
		int len = hash.size();
		int[] res = new int[len];
		int j = 0;
		for(int k : hash) {
			res[j++] = k;
		}
		return res;
	}
	
	//Q4
	public int groupsOfStudents(int[] studentIds) {
		int len = studentIds.length;
		int count = 0;
		for(int i = 0; i < len - 1; i++ ) {
			for(int j = i + 1; j < len; j++ ) {
				if((studentIds[i] + studentIds[j]) % 2 == 0)
					count++;
			}
		}
		return count;
	}
	
	
	

}
