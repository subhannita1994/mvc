import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a value:");
		int i = in.nextInt();
		
		Controller.getSumAndAverage(i);
		
		
	}

}
