package ch06_parameterValidation2;

public class DataExample4 {
	public static void main(String[] args) {

		int[] arr = {3,2,1,6,5,4};
		
		Data.printArr(arr);
		Data.sortArr(arr);
		Data.printArr(arr);
		System.out.println("sum Arr = " + Data.sumArr(arr));
		
	}
	
}
