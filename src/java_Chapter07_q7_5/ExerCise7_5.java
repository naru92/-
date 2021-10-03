package java_Chapter07_q7_5;

class Product {
    int price; // 제품 가격
    int bonusPoint; // 제품 구매시 제공 보너스 점수
    
    Product() {
        //빈 생성자가 없어서 컴파일 에러
        //밑에 명시된 생성자가 있기 때문에 Tv객체 생성시 Product 객체도 생성되야함
    }
    
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}


class Tv extends Product{
    Tv() {}
    
    public String toString() {
        return "Tv";
    }
}


public class ExerCise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
