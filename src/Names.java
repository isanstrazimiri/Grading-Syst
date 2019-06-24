import java.util.*;
public class Names {
	public static void main(String[] args ) {
		Scanner inp = new Scanner(System.in);
		
		int i=0;
		for (i=0;i<10;i++) {
			System.out.println("Enter the names");
			String names= inp.nextLine();
			System.out.println(names);
		}
		
	}
}
