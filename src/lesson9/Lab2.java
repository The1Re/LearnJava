package lesson9;

public class Lab2 {

	public static void main(String[] args) {
		try {
			new Student("Decha", "ABI").show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			new Student("George1", "ABC").show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			new Student("John Young", "DB").show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			new Student("Ted", "JAB").show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			new Student("Tony", "CAB").show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
