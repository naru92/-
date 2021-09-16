package ch06_variableAndMethod;

public class AddExample {
	public static void main(String[] args) {
		int result;
		Add add = new Add();
		
		
		result = add.a + add.b;
		result = add.c + add.d; //중복되는 연산이 보인다.
		
		//메서드를 만들면 값을 주고 호출만 하면 끝이다.
		result = add.plus(add.a, add.b);
		
		
	}
}
