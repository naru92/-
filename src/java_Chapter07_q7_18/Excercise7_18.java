package java_Chapter07_q7_18;

import java.awt.Desktop.Action;

public class Excercise7_18 {
    /*
      메서드명 : action
      기능 : 주어진 객체의 메서드를 호출한다.
            DanceRobot 인 경우, dance()를 호출하고,
            SingRobot 인 경우, sing()을 호출하고,
            DrawRobot 인 경우, draw()를 호출한다.
      반환타입: 없음
      매개변수 : Robot r - Robot 인스턴스 또는 Robot의 자손 인스턴스
    */
    public static void main(String[] args) {
      Robot[] arr = {new DanceRoboy(), new SingRobot(), new DrawRobot()};
      
      for(int i=0; i< arr.length; i++) {
          action(arr[i]);
      }
    }

    private static void action(Robot robot) {
       if (robot instanceof DanceRoboy) {
           DanceRoboy danceRoboy = (DanceRoboy)robot;
           danceRoboy.dance();
       }else if (robot instanceof SingRobot) {
           SingRobot singRobot = (SingRobot)robot;
           singRobot.sing();
       }else {
           DrawRobot drawRobot = (DrawRobot)robot;
           drawRobot.draw();
       }
        
    }
}

class Robot{}

class DanceRoboy extends Robot{
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot{
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot{
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}