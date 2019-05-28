import java.util.Scanner;
public class simplecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System);
		System.out.print("please type ur weight in kg");
		int kg = in.nextInt();
		int gram = kg / 1000;
		System.out.println("you weight equal to " + gram + " g");
	}

}
