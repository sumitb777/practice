package practice;

public class ReverseString {

	public static void main(String args []) {
		//reverse string
		String name="SUMIT";
		int l=name.length();
		String rev = "" ;
		for(int i=l-1;i>=0;i--){
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

	

}
