import java.util.Scanner;

public class PowerCal{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		
		System.out.println(Math.pow(base,exponent));
	}
}