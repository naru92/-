package ch06_question;

public class q6_18 {

}
class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv; // A 라인 - 참조형 변수가 올 수 없음

    static void staticMethod1() {
        System.out.println(cv);
       // System.out.println(iv); // B 라인 - 스테틱 메서드 안에서 인스턴스 변수를 사용 할 수 없다.
    }
    
    void instanceMethod1() {
         System.out.println(cv);
         System.out.println(iv); // C 라인
    }
    
    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1(); // D 라인 - 스테틱 메서드에선 인스턴트 메서드를 호출 할 수 없다
    }
    
    void instanceMethod2() {
        staticMethod1(); // E 라인
        instanceMethod1();
    }

}