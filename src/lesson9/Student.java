package lesson9;

import lesson9.exception.DigitException;
import lesson9.exception.GradeException;
import lesson9.exception.IncompleteException;
import lesson9.exception.SpaceException;

public class Student {
	private String name;
	private String grade;
	private final int CREDIT = 4;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	private int convert_grade(char c) {
		if (c == 'F')
			return 0;
		return 4-(c-'A');
	}
	
	private float calGrade() {
		float totalGrade = 0.f;
		for (char c : grade.toCharArray()) {
			totalGrade += CREDIT*convert_grade(c);
		}
		totalGrade /= CREDIT*grade.length();
		return totalGrade;
	}
	
	public void show() throws SpaceException, IncompleteException, DigitException, GradeException{
		//check name
		for (char c : name.toCharArray())
			if (Character.isDigit(c))
				throw new DigitException("DigitException : (digit is not allowed in name) can not display");
				
		if (name.indexOf(" ") != -1)
			throw new SpaceException("SpaceException : (space is not allowed in name) can not display");

		//check grade
		for (char c : grade.toCharArray()) 
			if ((c == 'E' || c < 'A' || c > 'F') && c!='I')
				throw new GradeException("GradeException : (grade must be A B C D F) can not display");

		if (grade.indexOf("I") != -1)
			throw new IncompleteException("IncompleteException : (grade I is incomplete) can not display");
		
		System.out.println(name + " registered " + grade.length() + " subjects and got GPA " + calGrade());
	}
}
