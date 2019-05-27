import java.util.Scanner;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("How old are you?:");
		int age = number.nextInt();
		System.out.print("Please input your salary per year?:");
		int salary = number.nextInt();
		
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
			
		}else {
			
		}
		System.out.println("Your tax is " + tax + " %");
	}

}
