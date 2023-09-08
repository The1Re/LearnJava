package lesson9;

public class Lab1 {

	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4};
		try {
			System.out.println(num[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}
		for (int i: num) {
			System.out.println(i);
		}			
	}

}
