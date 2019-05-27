import java.util.Scanner;
public class FindCommission {

	public static double getPercentComission(double a, double maia) {
		double result;
		if(a <= 4) {
			//JAN - APRIL
			if(maia < 3000) {
				result = 3;
			}else if(maia < 6000) {
				result = 4;
			}else if(maia < 9000) {
				result = 5;
			}else { 
				result = 6;
			}
		}else if(a >= 5 && a <= 8) {
			//MAY - AUGUST
			if(maia < 5000) {
				result = 4;
			}else if(maia < 8000) {
				result = 5;
			}else { 
				result = 6;
			}
		}else if(a >= 9 && a <= 12) {
			//SEPTEMBER - DECEMBER
			if(maia < 4000) {
				result = 5;
			}else if(maia < 7000) {
				result = 6;
			}else if(maia < 10000) {
				result = 7;
			}else { 
				result = 8;
			}
		}else {
			result = 0;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		
		System.out.print("Sale's month");
		double month = number.nextDouble();
		System.out.print("What's your sales:");
		double sales = number.nextDouble();
		double comissionPercent = getPercentComission(month, sales);
		System.out.println("Your comission is " + comissionPercent + " %");
		System.out.println("Which is " + (comissionPercent * sales / 100));
		
	}

}
