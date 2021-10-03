package java_Chapter07_q7_19;

import java.util.Arrays;

/** 
다음은 물건을 구입하는 사람을 정의한 Buyer 클래스이다 이 클래스는 멤버변수  .
로 돈 (money) 과 장바구니(cart) 를 가지고 있다 제품을 구입하는 기능의 buy메서드와 장   
바구니에 구입한 물건을 추가하는 add메서드 구입한 물건의 목록과 사용금액 그리고 남
은 금액을 출력하는 summary 메서드를 완성하시오.
**/


class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;
    
    void buy (Product p) {
        //아래의 로직에 맞게 코드를 작성하시오
        //1. 가진돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
        //2. 가진 돈이 충분하다면, 제품의 가격을 가진 돈에서 빼고
        //3. 장바구니에 구입한 물건을 담는다. (add메서드 호출)
        
        // 1.
        if(money < p.price) {
            return;
        }
        
        money -= p.price;
        add(p);
        
    }
    
    void add(Product p) {
       //1.i의 값이 장바구니의 크기보다 같거나 크면
       //2.기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
       //3. 새로운 장바구니와 기존의 장바구니를 바꾼다.
       // 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1증가시킨다.
        
        if(i >= cart.length) {
            Product[] temp = new Product[cart.length * 2]; 
      
           for(int i=0; i< cart.length; i++) {
               temp[i] = cart[i];
           }
          cart = new Product[temp.length];
          cart = temp;
          System.out.println(cart.length);
          
        }else {
            
               cart[this.i] = p;
               i++;
            
        }
        
    }
    
    void summary ( ) {
        //아래의 로직에 맞게 코드를 작성하시오
        //1. 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
        //2. 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
        //3. 물건을 사고 남은 금액(money)를 출력한다.
       int result = 0;
        
        for(int i=0; i< this.i; i++) {
            System.out.printf("목록 : %s \n" , cart[i].toString());
            System.out.printf("가격 : %d \n" , cart[i].price);
            System.out.println();
            result += cart[i].price;
        }
        System.out.printf("물건의 합 : %d \n" , result);
        System.out.println("남은금액 : " + ((money + result) - result));
    }
    
}
class Product {
    int price;
    
    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv() {super(100);}
       
    
    public String toString() {
        return "Tv";
    }
      
}

class Computer extends Product{
    Computer() {super(200);}
    
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product{
    Audio() {super(50);}
    public String toString() {
        return "Audio";
    }
}


public class ExerCise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        
        b.summary();
    }
  }
