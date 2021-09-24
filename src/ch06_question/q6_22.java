package ch06_question;

public class q6_22 {
    /*
     메서드명 : isNumber
    기 능 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다 : .
    모두 숫자로만 이루어져 있으면 를 반환하고 true ,
    그렇지 않으면 를 반환한다 false .
    만일 주어진 문자열이 이거나 빈문자열 이라면 를 반환한다 null “” false .
    반환타입 : boolean
    매개변수 String str 검사할 문자열  
      
    */
    public static boolean isNumber(String str) {
      
        for(int i=0; i<str.length(); i++) {
            char n = str.charAt(i);
            
            if(n < '0' || n > '9') {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+" 는 숫자 입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str+" 는 숫자 입니까? "+ isNumber(str));
     }
}
