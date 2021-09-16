package ch06_variableAndMethod;

public class CardExample {
	public static void main(String[] args) {
		
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7; 
		//카드객체1 - 하트 7생성
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		//카드객체2 - 스페이드 4생성
		
		System.out.printf("c1은 %s,%d 이며 높이는 %d 폭은 %d 입니다.\n", c1.kind, c1.number, Card.height, Card.width);
		System.out.printf("c2은 %s,%d 이며 높이는 %d 폭은 %d 입니다.\n", c2.kind, c2.number, Card.height, Card.width);
		//인스턴스 변수를 통해서 클래스변수에 접근 할 수 있지만 일반적으로는 클래스.클래스변수로 제어해야 이클립스에서 경고를 보내지 않는다.
		
		System.out.printf("c1의 높이와 폭을 각각 80, 50으로 변경합니다.\n");
		System.out.println();
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("변경 후");
		System.out.printf("c1은 %s,%d 이며 높이는 %d 폭은 %d 입니다.\n", c1.kind, c1.number, Card.height, Card.width);
		System.out.printf("c2은 %s,%d 이며 높이는 %d 폭은 %d 입니다.\n", c2.kind, c2.number, Card.height, Card.width);
	}
}
