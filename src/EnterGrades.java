import java.util.Scanner;
public class EnterGrades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ave=0;
		int i;
		int tot=0;
		for (i=0;i<10;i++) {
			System.out.print("Please enter your grades");
			int grades=in.nextInt();
			
			ave+=grades;
		    }
		tot=ave/i;
		System.out.println("Class ave grade is :"+ tot);
		
		}
				
	}


