package ch06_parameterValidation2;

public class ReferenceReturnExample {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = Data.copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
}
