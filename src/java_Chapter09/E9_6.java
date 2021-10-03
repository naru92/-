package java_Chapter09;

import java.util.Arrays;

public class E9_6 {
/**
 * 메서드명 : fillZero
기 능 : 주어진 문자열 숫자 로 주어진 길이의 문자열로 만들고, 왼쪽 빈 공간은'0' 으로 
채운다.
만일 주어진 문자열이 NULL 이거나 문자열의 길이가 length의 값과 같으면 그대로
반환한다.
만일 주어진 의 값이 0보다 같거나 작은 값이면 빈 문자열 ("")을 반환한다. 
반환타입 : String
매개변수 : String src - 변환할 문자열 
    int length - 변환한 문자열의 길이
**/
    
    public static String fillZero(String src, int length) {
        char [] zeroArr = null;
        
        if(src == null || src.length() == length ) {
            return src;
        }else if(length <= 0) {
            src = "";
        }else if(src.length() > length) {
           return  src.substring(0,length);
        }
        
        if(length > 0) {
            zeroArr = new char [length];
            Arrays.fill(zeroArr, '0');
            
            src = String.valueOf(zeroArr).substring(src.length()).concat(src);
         }
       
        
        return src;
    }
    
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}
