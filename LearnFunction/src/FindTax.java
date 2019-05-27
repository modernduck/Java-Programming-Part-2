import java.util.Scanner;
public class FindTax {

	
	public static int getTax(int age, int salary) {
		int tax = -1;
		if(age < 60) {
			if(salary < 250000) {
				tax = 0;
			}else if( salary < 500000) {
				tax = 10;
			}else if( salary < 1000000) {
				tax = 20;
			}else {
				tax = 30;
			}
		}else if(age < 80) {
			if(salary < 300000) {
				tax = 0;
			}else if( salary < 500000) {
				tax = 5;
			}else {
				tax = 10;
			}
		}else {
			if(salary < 500000) {
				tax = 0;
			}else {
				tax = 3;
			}
		}
		return tax;
	}
	
	public static double calculateTax(int tax, int salary) {
		
		return tax / 100.0 * salary;
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
		double cost = calculateTax(tax, salary);
		//output
		System.out.println("Your tax is " + tax + "% so you have to pay " + cost + " THB"); 
	}

}
