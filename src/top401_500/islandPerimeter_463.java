package top401_500;
/**
 * 
 */

/**
 * @author zhaolianzhou
 *
 */
public class islandPerimeter_463 {
	 public static int islandPerimeter(int[][] grid) {
	   int result=0;
	   for(int i =0; i<grid.length;i++){
		   for(int j=0; j<grid[i].length;j++){
			   if(grid[i][j]==1){
				  result+=4;
				  if(i!=0&&grid[i-1][j]==1)
					  result--;
				  if(i!=grid.length-1&&grid[i+1][j]==1)
					  result--;
				  if(j!=0&&grid[i][j-1]==1)
					  result--;
				  if(j!=grid[i].length-1&&grid[i][j+1]==1)
					  result--;
			   }
		   }
	   }
	   return result;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(islandPerimeter(grid));
	}

}
