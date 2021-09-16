package ch06_variableAndMethod;

public class AddExample2 {
	public static void main(String[] args) {
		int result;
		double divideResult;
		Add add = new Add();
		
		result = add.plus(10, 20);
		System.out.println("더하기 : " + result);
		result = add.minus(10, 5);
		System.out.println("빼기 : " + result);
		result = add.multiple(2, 3);
		System.out.println("곱하기 : " + result);
		divideResult = add.divide(10, 3);
		System.out.println("나누기 : " + divideResult);
		
	}
}
