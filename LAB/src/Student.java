
public class Student extends Person{

	public int studentId;
	public String institutionName;
	public int phoneNumber;
	
	public Student() {}
	
	public Student(int Id, String name, int phNo) {
		this.studentId = Id;
		this.institutionName = name;
		this.phoneNumber = phNo;
	}
	
	
	
	public void read() {
		super.read();
		System.out.print("StudentId:");
		this.studentId = in.nextInt();
		
		garbage = in.nextLine();
		
		System.out.println("instutution Name:");
		this.institutionName = in.nextLine();
		
		garbage = in.nextLine();
		
		System.out.println("phoneNumber:");
		this.phoneNumber = in.nextInt();
		garbage = in.nextLine();
		
	}
	
	// To display 
	public void disp() {
		super.disp();
		System.out.println("StudentId = "+this.studentId);
		System.out.println("instituation Name = "+this.institutionName);
		System.out.println("Phone Number = "+this.phoneNumber);
		
	}
	
}






















