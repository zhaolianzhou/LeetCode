package top401_500;

public class numberOfSegmentsInAString_434 {
	public static int countSegments(String s){
		s= s.trim();
		System.out.println(s);
		if(s.isEmpty())
			return 0;
		String[] slist = s.split("\\s+");
		return slist.length;
//		String trimmed = s.trim();
//	    if (trimmed.length() == 0) return 0;
//	    else return trimmed.split("\\s+").length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSegments("       "));
	}

}
