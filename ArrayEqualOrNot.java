package arrays;

import java.util.Arrays;

public class ArrayEqualOrNot {
	
	
	public static void main(String args[]) {
		
	
	int arr1[] = {1,2,3,4,0,5};
	
	int arr2[] = {5,0,1,2,3,4};
	
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	for(int i=0; i < arr1.length;i++) {
		if(arr1[i] != arr2[i]) {
			
			System.out.println("Not EQUAL");
		}
		
		else {
			
			System.out.println("EQUAL");
		}
	}
	}

}
