package practice;

public class fibonnaci_serise {

	public static void main(String[] args) {
	
		int a=0,b=1;
				//System.out.println(b+" ");
				for(int i=1;i<10;i++)
				{
					int c=a+b;
					System.out.print(c+",");
				    a=b;
				    b=c;
				}
	}

}
