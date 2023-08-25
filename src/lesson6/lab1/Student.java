package lesson6.lab1;

public class Student {
	protected int id;
	protected String name;
	protected double gpa;
	public Student(int id, String name, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public Student(int id, double gpa) {
		this(id, "", gpa);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student :" + "\n"
				+ "ID : " + id + "\n"
				+ "Name : " + name + "\n"
				+ "GPA : " + gpa;
	}
	
	
}
