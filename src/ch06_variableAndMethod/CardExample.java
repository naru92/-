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
		c1.kind = "Spade";
		c1.number = 4;
		//카드객체2 - 스페이드 4생성
		
		System.out.printf("c1은 %s,%d 이며 높이는 %d 폭은 %d 입니다", c1.kind,c1.number,c1.height,c1.width);
	}
}
