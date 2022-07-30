package arrays;

public class ReverseArrayInGroupSingleTraverse {
	
	
	public static void main(String args[]) {
		
	
	
	int arr[] = {1,2,3,4,5,6,7,8,9};
	
	int k=3;
	
	for(int i=0; i<arr.length; i=k+i) {
		
		int left =i;
		
		int right = Math.min(i+k-1, arr.length-1);
		
		int temp;
		
		
		while(left<right) {
			
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		
	}
	
	for(int l = 0; l<arr.length;l++) {
		System.out.println(arr[l]);
	}
	}
	

}
