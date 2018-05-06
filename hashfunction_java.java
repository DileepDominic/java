import java.util.ArrayList;

class Source {
	/* Add your code here */

	static long generateHashCode(String s) {
		long h ;
		
		//Length of the string * ASCII value of the first letter of the username
		
		h = s.length() * (int)s.charAt(0);		
		return h;	
	}
	
	
	
	public static void main(String args[]) {
		
		ArrayList<String> states = new ArrayList<String>();
		
		states.add("Barun");
		states.add("Mayank");
		states.add("Karan");
		states.add("Shubham");

		Source hd = new Source();
		for (String s : states)
			System.out.println(hd.generateHashCode(s));
	}
}
