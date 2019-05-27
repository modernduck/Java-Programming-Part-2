import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		switch( a ){
			case 1:
				System.out.println("THIS IS FROM CASE ONE");
				break;
			case 3:
				System.out.println("THIS IS FROM CASE 3");
				break;
			case 5:
				System.out.println("THIS IS FROM CASE 5");
				break;
			default:
				System.out.println("DEFAULT");
		}
		
	}

}
