
public class GraduateStudent extends Student{

	public String programName;
	public int noOfSubjects;
	public String classTeacherNamer;
	
	public GraduateStudent() {}
	
	public GraduateStudent(String prog, int noSub, String tech) {
		
		this.programName = prog;
		this.noOfSubjects = noSub;
		this.classTeacherNamer = tech;
		
	}
	
	public void read() {
		super.read();
		System.out.print("program name:");
		this.programName= in.nextLine();
		
		garbage = in.nextLine();
		
		System.out.println("no of subject:");
		this.noOfSubjects = in.nextInt();
		
		garbage = in.nextLine();
		System.out.println("class teacher name:");
		this.classTeacherNamer = in.nextLine();
		
	}
	
	// To display 
	public void disp() {
		super.disp();
		System.out.println("program name = "+this.programName);
		System.out.println("no of subject = "+this.noOfSubjects);
		System.out.println("teacher name = "+this.classTeacherNamer);
		
	}
}























































