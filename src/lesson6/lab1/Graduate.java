package lesson6.lab1;

public class Graduate extends Student{
	protected String thesisTitle;

	public Graduate(int id, String name, double gpa, String thesisTitle) {
		super(id, name, gpa);
		this.thesisTitle = thesisTitle;
	}

	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	
	@Override
	public String toString() {
		return "Graduate " + super.toString() + "\n"
				+ "Thesis : " + thesisTitle;
	}
}
