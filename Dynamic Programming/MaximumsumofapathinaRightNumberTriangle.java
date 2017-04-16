public class MaxSum {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[][] arr =   {{1}, 
			{1, 2},
			{4, 1, 2},
			{2, 3, 1, 1}};
//	System.out.println(arr.toString());
	System.out.println(solve(arr));
    }
    
    public static int solve(int[][] arr) {
	for (int i = 1; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		if(j == 0){
		    arr[i][j] = arr[i][j] + arr[i-1][j]; 
		    continue;
		}
		if(j == arr[i].length-1){
		    arr[i][j] = arr[i-1][j-1] + arr[i][j];
		    continue;
		}
		
		arr[i][j] = arr[i][j] + Math.max(arr[i-1][j],arr[i-1][j-1]);
	    }
	}
    int max = arr[arr.length-1][0];
    for (int i = 0; i < arr.length; i++) {
	max = Math.max(max, arr[arr.length-1][i]);
    }
    return max;
    }
    
    
}

