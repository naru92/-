package ch06_createInstance;


public class TvExample4 {
    public static void main(String[] args) {
        
       Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv클래스 배열 생성
       
       //Tv 객체를 생성해서 Tv객체 배열의 각 요소에 저장
       for(int i=0; i < tvArr.length; i++) {
           tvArr[i] = new Tv();
           tvArr[i].channel = i+10; //tvArr[i]의 변수 channel에 각각 i+10 을 셋팅
           System.out.printf("현재 채널의 값 : %d\n" ,  tvArr[i].channel); //값 확인
       }
       System.out.println();
       System.out.println("채널업 실행후");
       for(int i=0; i < tvArr.length; i++) {
           tvArr[i].channelUp(); // 채널업 호출
           System.out.printf("현재 채널의 값 : %d\n" ,  tvArr[i].channel); //값 확인
       }
       
    }
}
