package ch06_question;

public class q6_24 {
    /*
    메서드명 : abs
    기 능: 주어진 값의 절대값을 반환한다 
    반환타입 : int
    매개변수 : int value
    */
    static int abs (int value) {
        if(value < 0) {
          int result = value * -1;
          return result;
        } else if (value > 0) {
           return value;
        }else {
            return 0;
        }
    }
    
    
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value +"의 절대값 : " + abs(value));
        value = -10;
        System.out.println(value +"의 절대값 : " + abs(value));
    }
}
