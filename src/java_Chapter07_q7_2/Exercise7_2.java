package java_Chapter07_q7_2;

import java.util.Random;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    
    SutdaDeck() {
        //배열 SutdaCard를 적절히 초기화 하시오.
       int number = 0;
       boolean kwang = false;
       
        for(int i=0; i < cards.length; i++) {
            
           if(i > 10) {
               number = i - 10 + 1;
           }else {
               number = i+1;
           }
           
           if(i+1 == 1 &&  i < 10 || i+1 == 3 && i < 10 || i+1 == 8 && i < 10-1 ) {
               kwang = true;
           }else {
           kwang = false;
           }
           cards[i] = new SutdaCard(number, kwang);
        }
    }
    
    
    /** 
     * 1. : shuffle 메서드명
         기 능 : 배열에 담긴 카드의 위치를 뒤섞는다  cards .(Math.random() 사용)
         반환타입 : 없음 
         매개변수 : 없음 
         
         2. : pick 메서드명
         기 능 : 배열 cards에서 지정된 위치의  SutdaCard 를 반환한다.
         반환타입 : SutdaCard
         매개변수 위치 : int index - 위치
         
         3. 메서드명 : pick 
         기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다 사용  (Math.random() 사용)
         반환타입 : SutdaCard
         매개변수 : 없음 
    **/
    
     Random random = new Random();
     public void shuffle() {
         for(int i=0; i<cards.length; i++) {
             int j = random.nextInt(cards.length);
             
             SutdaCard sutdaCard = cards[i];
             cards[i] = cards[j];
             cards[j] = sutdaCard;
         }
         
     }
     public SutdaCard pick(int index) {
         return new SutdaCard(cards[index].num, cards[index].isKwang);
     }
     public SutdaCard pick() {
         int randomNumber = random.nextInt(cards.length)+1;
         return pick(randomNumber);
     }
    
}

class SutdaCard{
    int num;
    boolean isKwang;
    
    
    SutdaCard() {
        this(1,true);
    }
    
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}



public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        
        
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        
        for(int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        
        System.out.println();
        System.out.println(deck.pick(0));
    }
} 

