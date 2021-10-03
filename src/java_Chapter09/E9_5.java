package java_Chapter09;

/**
 * 메서드명 :count 
 * 기능 : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반호나한다.
 * 반환타입: int 
 * 매개변수 : String src
 *          String target
 *          
 * Hint String 클래스의 indexOf(String str, int fromIndex)를 사용할 것
 */
public class E9_5 {
    
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;
        //반복문 사용
        //1.src에서 타겟을 pos의 위치부터 찾는다
        //2. 찾으면 count 값을 1증가 시키고
        //  pos의 값을 target.length만큼 증가시킨다.
        // 3.indexOf의 결과가 -1이면 반복문을 빠져나가고 count 반환
       
        while(true) {
          
           if(src.indexOf(target, pos) != -1) {
               System.out.println(src.indexOf(target, pos));
           count++;
           System.out.println("pos : " + pos);
           pos = (src.indexOf(target, pos) + target.length());
           }else {
               break;
           }
        }
      
        return count;
        
    }
    
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
}
