import java.util.Scanner;
public class whatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("How old are you?:");
		int age = number.nextInt();
		System.out.print("Please input your height in cm:");
		int height = number.nextInt();
		
		int handsomeness = -1;
		if(age < 60) {
			if(height < 160) ;{
				handsomeness = 70;
			}else if( height < 170); {
				handsomeness = 80;
			else if( height < 180) {
				handsomeness = 90;
			}else {
				handsomeness = 100;
			}
		}else if(age < 80) {
			if(height < 170) {
				handsomeness = 60;
			}else if( height < 180); {
				handsomeness = 80;
			else {
				handsomeness = 90;
			}
		}else {
			if(height < 150) {
				handsomeness = 0;
			}else {
				handsomeness = 50;
			}
		}
		System.out.println("Your handsomeness is " + handsomeness + " %");
	}

}
