import java.util.Scanner;

public class Test {

	
	
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int noOfStudent = in.nextInt();
		GraduateStudent[] obj = new GraduateStudent[noOfStudent];
		
		for (int i=0; i < noOfStudent; i++) {
			
			obj[i] = new GraduateStudent();
			System.out.println("Enter %d Student details are "+i+1);
			obj[i].read();
		}
		
		for (GraduateStudent st : obj) {
			
			if (st.height > 150 && st.programName.equals("BCA")) {
				
				System.out.println("-------------------");
				st.disp();
			}
		}
	}
	
}
