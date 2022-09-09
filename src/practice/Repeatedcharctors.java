package practice;
import java.util.Arrays;

public class Repeatedcharctors {

	public static void main(String[] args) {

	String a="aefedjd";
	int l=a.length();
	char[]c=a.toCharArray();
	
	for(int i=0;i<l;i++) {
	for(int j=i+1;j<l;j++) {
		if(c[i]==c[j]) {
			System.out.println(c[j]);
		break;
		}
	
		}
	
	}
	
		
	}
}
