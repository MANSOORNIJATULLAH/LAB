
import java.util.*;
public class Person {

	// Data member 
	public String name;
	public int age;
	public float height;
	public static String garbage;
	Scanner in = new Scanner(System.in);
	
	public Person() {
		
	}
	
	public Person(String n, int ag, float height) {
		
		this.name=n;
		this.age=ag;
		this.height=height;
		
	}
	
	//To read 
	public void read() {
		System.out.print("Enter your name:");
		this.name = in.nextLine();
		
		garbage = in.nextLine();
		
		System.out.println("Enter your age:");
		this.age = Integer.parseInt(in.nextLine());
		
		garbage = in.nextLine();
		
		System.out.println("Enter your height:");
		this.height = in.nextFloat();
		
		garbage = in.nextLine();
		
	}
	
	// To display 
	public void disp() {
		
		System.out.println("Name = "+this.name);
		System.out.println("Age = "+this.age);
		System.out.println("Height = "+this.height);
		
	}
}


































