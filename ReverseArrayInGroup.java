package arrays;

public class ReverseArrayInGroup {
	

	
	public static void main(String args[]) {
		
		int k = 3;
		
		int arr[] = {1,2,3,4,5};
		
		int temp[] = new int[5];
		
		int j = k;
		
		for(int i = 0; i<k; i++) {
			
		 temp[j-1] = arr[i];
		 
		 j--;
		 
		}
		
		for(int l=arr.length-1; l>k-1; l--) {
		
			
		 temp[k] = arr[l];
		 
		 k++;
			
		}
		
		
		for(int m = 0; m<arr.length; m++) {
			
			System.out.println(temp[m]);
		}
	}
	


}
