import java.util.Scanner;
public class FindTax {

	
	public static int getTax(int age, int salary) {
		
		
		
		return -1;
	}
	
	public static int calculateTax(int tax, int salary) {
		
		return -2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("How old are you?:");
		int age = number.nextInt();
		System.out.print("Please input your salary per year?:");
		int salary = number.nextInt();
		//kumnuan
		int tax = getTax(age, salary);
		int cost = calculateTax(tax, salary);
		//output
		System.out.println("Your tax is " + tax + "% so you have to pay " + cost + " THB"); 
	}

}
