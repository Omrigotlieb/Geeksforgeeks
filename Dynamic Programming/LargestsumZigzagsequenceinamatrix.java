/**
 * 
 */
package temp;

/**
 * @author omrigotlieb
 *
 */
public class MaxSum {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[][] arr =   {{4,2,1}, 
			{3,9,6},
			{11,3,15}};
			
	System.out.println(solve(arr));
    }
    
    public static int solve(int[][] arr) {
	for (int i = 1; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		int max = Integer.MIN_VALUE;
		for (int k = 0; k < arr.length; k++) {
		    if(k == j) continue;
		    max = Math.max(max, arr[i-1][k]);
		}
		arr[i][j] = arr[i][j] + max;
		
	}
	}
    int max = arr[arr.length-1][0];
    for (int i = 0; i < arr.length; i++) {
	max = Math.max(max, arr[arr.length-1][i]);
    }
    return max;
    }
    
    
}

