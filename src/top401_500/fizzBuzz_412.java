package top401_500;
import java.util.ArrayList;
import java.util.List;

public class fizzBuzz_412 {
	public List<String> fizzBuzz(int n){
		ArrayList<String> result = new ArrayList<String>();
		for (int i =1; i <=n; i++){
			if(i%3==0&&i%5!=0)
				result.add("Fizz");
			else if(i%3!=0&&i%5==0)
				result.add("Buzz");
			else if(i%15==0)
				result.add("FizzBuzz");
			else 
				result.add(Integer.toString(i));
		}
		return result;
	}
}
