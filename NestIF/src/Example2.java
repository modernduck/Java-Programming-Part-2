import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("Month(1 - 12):");
		int month = number.nextInt();
		System.out.print("Sales:");
		int sales = number.nextInt();
		int comission = -1;
		if( month >= 1 &&  month < 5) {
			if(sales < 3000) {
				comission = 3;
			}else if(sales <  6000) {
				comission = 4;
			}else if(sales < 9000) {
				comission = 5;
			}else {
				comission = 6;
			}
		}else if(month >= 5 && month < 9) {
			if(sales < 5000) {
				comission = 4;
			}else if(sales < 8000) {
				comission = 5;
			}else {
				comission = 6;
			}
		}else if(month >= 9 && month <= 12) {
			if(sales < 4000) {
				comission = 5;
			}else if(sales < 7000) {
				comission = 6;
			}else if(sales < 10000) {
				comission = 7;
			}else {
				comission = 8;
			}
				
		}
		System.out.println("YOU GOT COMMISSION " + comission + " %");
	}

}
