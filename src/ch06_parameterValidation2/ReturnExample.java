package ch06_parameterValidation2;

public class ReturnExample {
	public static void main(String[] args) {
		ReturnExample r = new ReturnExample();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0}; //배열 생성후 result2[0]의 값을 0으로 초기화
		r.add(3,5,result2); //배열을 add 메서드의 매개변수로 전달
		System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b; //매개변수로 넘겨받은 배열에 연산결과에 저장(참조변수라 데이터가 저장됨)
	}
	
}
