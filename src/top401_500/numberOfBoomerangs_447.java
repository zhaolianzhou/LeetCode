package top401_500;
import java.util.HashMap;
/**
 * No 447
 * Description:
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * Example:
 * Input:
 * [[0,0],[1,0],[2,0]]
 * Output:
 * 2
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 * @author Zhaolian
 *
 */
public class numberOfBoomerangs_447 {
	public int numberOfBoomerangs(int[][] points){
		int result=0;
		HashMap<Integer, Integer> disCount =  new HashMap<Integer, Integer>();
		
		for(int i =0; i < points.length;i++){
			disCount.clear();
			for(int j = 0; j < points.length; j++){
				int dis = calDis(points[i],points[j]);
				if(i!=j){
					if(disCount.containsKey(dis)){
						int value = disCount.get(dis)+1;
						disCount.put(dis, value);
					}
					else
						disCount.put(dis, 1);
				}
			}
			for(int count : disCount.values()){
				if(count>1){
					result +=count*(count-1);
				}
			}
		}
		return result;
	}
	
	public int calDis(int[] p1, int[] p2){
		int x = Math.abs(p1[0]-p2[0]);
		int y = Math.abs(p1[1]-p2[1]);
		int Dis = x*x+y*y;
		return Dis;
	}
}
