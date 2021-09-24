package ch06_question;

public class q6_8 {
    int kind; //인스턴스 변수
    int num; //인스턴스 변수
    
    static int width; //클래스변수
    static int height; //클래스 변수
    
    q6_8(int k , int n){
        //k, n 지역변수
        kind = k;
        num = n;
    }
    
    public static void main(String[] args) {
        q6_8 card = new q6_8(1,1);
        //arg 지역변수 , card 지역변수
    }
}
