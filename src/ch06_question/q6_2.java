package ch06_question;

public class q6_2 {
    public static void main(String[] args) {
        StudaCard card1 = new StudaCard(3, false);
        StudaCard card2 = new StudaCard();
        
        System.out.println(card1.info()); // 3 . 이 출력된다
        System.out.println(card2.info()); // 1K . 
    }
}

