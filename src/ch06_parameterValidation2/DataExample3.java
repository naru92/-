package ch06_parameterValidation2;

public class DataExample3 {
	public static void main(String[] args) {

		int[] x = {10};
		System.out.println("main() : x = " + x[0] );
		
		Data.change(x);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + x[0]);
		
	}
	
}
