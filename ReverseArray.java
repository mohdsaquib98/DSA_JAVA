package arrays;

public class ReverseArray {
	
	
	
	public static void main(String args[]) {
		
		int n = 5;
		int arr[] = {1,2,3,4,5};
		
		int temp[] = new int[n];
		
		int j = n;
		
		
			for(int i=0; i<arr.length; i++) {
				
				temp[j-1] = arr[i];
				
				j--;
			
			
		}
			
	    for(int k=0; k<n; k++) {
	    	
	    	System.out.println(temp[k]);
	    	
	    	
	    }
	}

}
