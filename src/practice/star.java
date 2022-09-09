package practice;



public class star {
	public static void main(String args[]) {
		for(int i=0;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();}
		
		System.out.println("-------------------");
		for (int l=1;l<=4;l++)
		{
			for(int k=4;k>=l;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	for(int i=1;i<=4;i++)
	{
		for (int k=4;k>=i;k--) {
			System.out.print(" ");
		}
		for(int l=1;l<=i;l++) {
			System.out.print(" *");// add space output is trinagle
		
		}
		System.out.println();
	}
			
			
		
		
		
	}

}
