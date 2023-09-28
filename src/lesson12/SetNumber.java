package lesson12;

import java.util.HashSet;
import java.util.Scanner;

public class SetNumber {
	
	private static HashSet<Integer> toSet(String list){
		HashSet<Integer> set = new HashSet<>();
		list = list.replace("[", "").replace("]","").replaceAll(" ", "");
		for (String s : list.split("\\,")) {
			set.add(Integer.parseInt(s));
		}
		return set;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> a,b;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int index = input.contains("+") ? input.indexOf("+") : input.contains("*") ? input.indexOf("*") : input.indexOf("-");
		String[] list = input.split("\\"+input.charAt(index));
		a = toSet(list[0]);
		b = toSet(list[1]);
		switch (input.charAt(index)) {
			case '+':a.addAll(b);break;
			case '*':a.retainAll(b);break;
			case '-':a.removeAll(b);break;
		}
		System.out.println(a);
		sc.close();
		
	}
}
