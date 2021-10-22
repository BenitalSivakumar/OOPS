package oopsAssignments;

public class StringAssignment {
public static void main(String[] args) {
	
	String str3 = new String("Kutty");
	 String str4 = new String("Kutty");
	 
	 if(str3==str4) {
		 System.out.println(" Same text");
	 }
	 else
		 System.out.println("Diff text");
	 
	 System.out.println("***");

}
	 
}

//justification= given string is same however it has stored in a different location.since it is declared as string literal 
//memory location will be compared and the output is different.