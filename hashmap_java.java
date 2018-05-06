
import java.util.ArrayList;
import java.util.HashMap;


public class Source {
	
	public static HashMap<Long, String> map = new HashMap<Long, String>();
	
	public void setmap() {
		
	map.put(111L,"SPAM");
	map.put(101L,"NOT SPAM");
	map.put(105L,"NOT SPAM");
	map.put(113L,"SPAM");
	map.put(118L,"NOT SPAM");
	
	}

	public static String isSpam(long ln) {
		
		return map.get(ln);
	}

	public static void main(String[] args) {
		ArrayList<Long> phoneNum = new ArrayList<Long>();
		phoneNum.add(111L);
		phoneNum.add(101L);
		phoneNum.add(105L);
		phoneNum.add(113L);
		phoneNum.add(118L);
		
		Source hd = new Source();
		hd.setmap();
		
		
		for (Long ln : phoneNum) {
			System.out.println(ln + ":" + Source.isSpam(ln));
		}

	}
}
