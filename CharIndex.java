package oopsAssignments;

public class CharIndex {

	
public static void main(String[] args) {
	String text = "Java Exercise";
char[] a=text.toCharArray();
	for (int i = 1; i < a.length; i++) {
		if(a[i]==('s')) {
			System.out.println(i);
		}
			else if(a[i]==('e')) {
				System.out.println(i);
		}
		
	}
}
}
