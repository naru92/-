package ch06_createInstance;


public class TvExample {
    public static void main(String[] args) {
        
        Tv tv;  // Tv객체를 생성하기 위해 변수 tv 생성후
        tv = new Tv(); // new 연산자를 통해 인스턴스를 생성
        
        //인스턴스변수 tv로 기능(메서드에 아래와 같이 호출)
        
        tv.channel = 7; //클래스 인스턴스 맴버 channel에 7을 셋팅
        tv.channelDown(); //정의해둔 기능에 의해 채널 값 7이 -1된다.
        
        System.out.printf("현재 채널의 값 : %d" , tv.channel);
    }
}
