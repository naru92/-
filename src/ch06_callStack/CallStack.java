package ch06_callStack;

public class CallStack {
	
	public static void firstMethod() {
		System.out.println("첫번째 메서드 호출입니다.");
		secondMethod(); 
		System.out.println("첫번째 메서드 종료입니다.");
	};
	
	public static void secondMethod() {
		System.out.println("두번째 메서드 호출입니다.");
		System.out.println("두번째 메서드 종료입니다.");
	};
	
	
}
