package ch06_parameterValidation2;

public class DataExample2 {
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x );
		
		Data.change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
	}
	
}
