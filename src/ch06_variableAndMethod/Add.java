package ch06_variableAndMethod;

public class Add {
	
	int a = 7;
	int b = 6;
	int c = 13;
	int d = 9;
	
	//두개의 정수값을 받아 더하는 메서드
	public int plus (int a, int b) {
		return a + b;
	}
	public int minus (int a, int b) {
		return a - b;
	}
	public int multiple (int a, int b) {
		return a * b;
	}
	public double divide (int a, int b) {
		return (double)a / b;
	}
}
