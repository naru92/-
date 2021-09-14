package ch06_createInstance;


public class TvExample3 {
    public static void main(String[] args) {
        
        Tv tv1 = new Tv(); // 변수이름 tv1인 Tv객체 생성 
        Tv tv2 = new Tv(); // 변수이름 tv2인 Tv객체 생성 
        
        System.out.printf("tv1의 현재 채널의 값 : %d\n" , tv1.channel);
        System.out.printf("tv2의 현재 채널의 값 : %d\n" , tv2.channel);
        
        tv2 = tv1; // t1의 주소값을 t2에 대입한다. 즉, 둘의 주소값이 같아진다.
        tv1.channel = 7;
        System.out.printf("tv1의 현재 채널의 값 : %d로 변경 하였습니다\n" , tv1.channel);
        
        
        
        System.out.printf("현재 채널의 값 : %d\n" , tv1.channel);
        System.out.printf("현재 채널의 값 : %d\n" , tv2.channel);
    }
}
