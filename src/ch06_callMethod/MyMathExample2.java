package ch06_callMethod;

public class MyMathExample2 {
	
	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2(); //인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		
		//인스턴스 메서드는 인스턴스가 생성되어야 한다.
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
