package practice;
import java.util.Scanner;

public class calculater {
	public static void main(String[] args) {
		String yn;
		Scanner sc = new Scanner(System.in);
		do {
		int no1, no2;
		String sy;
		
		System.out.println("enter no 1");
		no1 = sc.nextInt();
		System.out.println("enter action ");
		sy = sc.next();
		System.out.println("enter no 2");
		no2 = sc.nextInt();
		int res = 0;
		switch (sy) {
		case "+":
			res = no1 + no2;
			System.out.println(res);
			break;
		case "-":
			res = no1 - no2;
			System.out.println(res);
			break;
		case "*":
			res = no1 * no2;
			System.out.println(res);
			break;
		case "/":
			res = no1 / no2;
			System.out.println(res);
			break;
			default:
				System.out.println("invaild action");
				break;}
		System.out.println("want continue press y or n");
		yn=sc.next();
		
		}while
			(yn.equals("y")||yn.equals("Y"));
		
		sc.close();
}
	
}
