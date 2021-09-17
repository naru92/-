package ch06_parameterValidation2;

public class Data {
	int x;
	
	static Data copy(Data d) {
		Data temp = new Data();
		temp.x = d.x;
		
		return temp;
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() : x = " + 	x[0]);
	}
	
	static void printArr(int[] arr) {//배열의 모든 요소를 출력
		System.out.print("[");
		
		for(int i : arr) {
			System.out.print(i + ",");
		}
		
		System.out.print("]");
		System.out.println();
	}
	
	static int sumArr(int[] arr) {//배열의 합을 반환
		int sum = 0;
		
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	static void sortArr(int[] arr) {//배열의 모든 요소를 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}

