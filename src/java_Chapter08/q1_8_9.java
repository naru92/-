package java_Chapter08;

/**
 * * 클래스 명 : UnsupportedFuctionException 
 * 조상클래스 명: RuntimeException 
 * 멤버변수 : 
이 름 : ERR_CODE
저장값 :  에러코드
타 입 : int
기본값 : 100
제어자 : final private

 * : 메서드
1. : getErrorCode 메서드명
    기 능 에러코드 를 반환한다 : (ERR_CODE) .
    반환타입 : int
    매개변수 : 없음 
    제어자 : public
2. : getMessage 메서드명
    기 능 메세지의 내용을 반환한다.(Exception클래스의 getMessage()를 오버라이딩 ) 
    반환타입 : String
    매개변수 : 없음 
    제어자 : public
 */
public class q1_8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFuctionException extends RuntimeException {
    final private int ERR_CODE;
    private String message = "";
    
    UnsupportedFuctionException(String message, int i) {
        this.message = message;
        ERR_CODE = i;
    }
    
    
    public int getErrorCode() {
        return ERR_CODE;
    }
    
    @Override
    public String getMessage() {
        
        return new String("["+ ERR_CODE+"]" + this.message);
    }
}
