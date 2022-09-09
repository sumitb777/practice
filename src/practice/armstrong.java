package practice;

public class armstrong {

	public static void main(String args[]) {

		int no = 1634;
		int no2 = no;
		int count = 0;
		while (no2 != 0) {
			no2 = no2 / 10;
			count++;
		}

		int no3 = no;
		int sum = 0;
		while (no3 != 0) {
			int rem = no3 % 10;//4,3,6,1
			int p = 1;
			for (int i = 0; i < count; i++) {
				p = p * rem;   //1*4,4*4,16*4,64*4=256,,,  //1*3,3*3,9*3,27*3=81 //1*6,6*6,36*6,216*6=1296,
			}                         //1*1*1*1=1 //  265+81+1296+1=1634
			sum = sum + p;
			no3 = no3 / 10;//163//16//1

		}
		if (sum == no)
			System.out.println("its armstrong no");
		else
			System.out.println("its not ");

	}

}
