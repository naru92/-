package ch06_callMethod;

public class MyMath {
	
	long add (long a, long b) {
		long result = a+b;
		
		return result;
		// return a+b; 위의 두줄은 이 코드와 같다.
				
	}
	
	int diff(int x, int y) {
		int result = Math.abs(x-y);
		return result;
		//return Math.abs(x-y);
	}
	
	int abs(int x) {
		
		if(x>=0) {
			return x;
		}else {
			return -x;
		}
		
		//return x >= 0 ? x : -x;
	}
	
	
	
	long subtract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
}
