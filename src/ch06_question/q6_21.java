package ch06_question;

public class q6_21 {
    public static void main(String[] args) {
        MyTv tv = new MyTv();
        tv.turnOnOff();
        System.out.println(tv.isPowerOn);
    }
}
class MyTv {
    
    boolean isPowerOn = false;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    void turnOnOff() {
        System.out.println("전원 상태를 변경합니다.");
       if(isPowerOn) {
           isPowerOn = false;
       }else {
           isPowerOn = true;
       }
        // (1) isPowerOn true false , false true .
    }
} 
    