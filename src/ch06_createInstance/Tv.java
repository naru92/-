package ch06_createInstance;

public class Tv {
    
    //Tv의 속성을 정의합니다.(맴버변수(=인스턴스맴버))
    String color; //색상
    boolean power; // 전원 상태(on/off)
    int channel; //채널
    
    //Tv의 기능(메서드)
    void power() {
        power = !power; //Tv의 전원을 끄는 기능
    }
    
    void channelUp() {
        channel++; //Tv의 채널을 높이는 기능
    }
    
    void channelDown() {
        channel--; //Tv의 채널을 낮추는 기능
    }
    
}
