package football;

import java.awt.Frame;
import java.util.Arrays;

public class VanPersie {
	private String name;
	private String position;
	private String friend[];
		
	public VanPersie() {
	
		name = "VanPersie";
		position = "Cen";
		friend = new String[]{"Rafael","Jonny Evans","Wayne Rooney","Ryan Giggs"};
				
		System.out.println("My name is VanPersie");
		System.out.println("I am : "+name);
		System.out.println("Position : "+position);
		System.out.println("Friend : "+Arrays.toString(friend));
	}
	
	public VanPersie(int n) {
		System.out.println("My name is VanPersie 1");
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
		
	public String[] getFriend() {
		return friend;
	}
	
}
