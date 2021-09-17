package ch06_callMethod;

public class MyMathExample {
	
	public static void main(String[] args) {
		
		MyMath myMath = new MyMath(); //1.인스턴스를 생성한다
		
		long value = myMath.add(1L, 2L);//2.메서드를 호출한다 -> 3.메서드가 실행되어 리턴값이 변수 value에 담긴다.
		
		//4. 호출한 메서드 코드 종료후 아래에 코드가 있다면 이후의 문장을 실행한다.
		System.out.println("value값 : " + value);
		
	}
}
