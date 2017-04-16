import java.io.*;
import java.util.Arrays;

class GFG {
	public static void main (String[] args) {
		int[] arr = {1,7};
		int m = 8;
		System.out.println(solve(arr,m)?"YES":"NO");
	}
	
	public static boolean solve(int[]arr, int m){
	if (m < arr.length) {
	    return true;
	}
	boolean[] result = new boolean[m];

	for (int i=0;i<arr.length ;i++ ){	    
	    if(result[0] == true){
	        return true;
	    }
	    boolean[] temp = new boolean[m];
	    for(int j = 0; j < m; j++){
	        if(result[j] == true){
	            if(result[(j + arr[i])%m] == false){
	                temp[(j + arr[i])%m] = true;
	            }
	        }
	    }
	    temp[arr[i]%m] = true;
	    for(int j = 0; j < m; j++){
	     if(temp[j] == true){
	         result[j] = true;
	     }   
	    }
	}
	return result[0];
	}
}