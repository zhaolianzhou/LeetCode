import java.util.HashSet;

public class containsDuplicate_217 {
	public boolean containDuplicate(int[] nums){
		HashSet<Integer> currNum = new HashSet<Integer>();
		for(int i : nums){
			if(currNum.contains(i))
				return true;
			else
				currNum.add(i);
		}
		return false;
	}
}
