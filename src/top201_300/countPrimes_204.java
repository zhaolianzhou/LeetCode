package top201_300;
/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Use the Sieve of Eratosthenes
 * @author Zhaolian
 *
 */
public class countPrimes_204 {
	public static int countPrimes(int n){
		int result = 0;
		for(int i = 1; i < n; i++){
			if(isPrime(i))
				result++;
		}
		return result;
	}
	public static int countPrimes2(int n){
		int result = 0; 
		boolean[] isPrime = new boolean[n];
		for(int i = 2; i< n; i++)
			isPrime[i] = true;
		
		for(int i = 2; i < Math.sqrt(n); i++){
			if(!isPrime[i])
				continue;
			for(int j = i*i; j < n; j+=i){
				isPrime[j] = false;
			}
		}
		for(int i = 2; i < n; i++){
			if(isPrime[i])
				result++;
		}
		return result++;
	}
	public static boolean isPrime(int num){
		if(num <=1)
			return false;
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(countPrimes(1500000));
	}
}
