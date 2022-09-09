package practice;


public class pallindrome_string {
	public static void main(String args[]) {
   //pallindrome
		//reverse string compare to actual string if its same its pallindrome 
	String name="pankaj";
	String name2=name;
	String rev="";
	for (int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	if (rev.equals(name2))
		System.out.println("pallindrome");
	else 
		System.out.println("not pallindrome");
		
	
	
	}		
	}
		
		
		
	
	

