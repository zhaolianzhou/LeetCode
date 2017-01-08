package top301_400;

import java.util.HashSet;

public class evaluateDivision_4_399 {
	public double[] calcEquation(String[][] equations, double[] values, String[][] query) {
        double[] results = new double[query.length];
        HashSet<String> varaSet = new HashSet<String>();
        for(int i =0; i <equations.length;i++)
        	for(int j =0; j <equations[i].length; j++){
        		varaSet.add(equations[i][j]);
        	}
        for(int k =0; k <query.length; k++){
        	if(!varaSet.contains(query[k][0])||!varaSet.contains(query[k][1]))
        		results[k]=-1.0;
        	else if(query[k][0]==query[k][1])
        		results[k] = 1.0;
        }
        return results;
    }
}
