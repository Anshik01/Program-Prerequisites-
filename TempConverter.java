import java.util.Scanner;

public class TempConverter{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int celsius = sc.nextInt();
		int ans = (celsius * 9/5) + 32;
		
		System.out.println(ans);
	}
}