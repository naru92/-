package ch06_recrusiveCall;

public class Factorial {
	
	static int factorial (int n) {
		int result = 0;
		
		if( n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1); //다시 메서드 자신을 호출한다
		}
		return result;
	}
}
