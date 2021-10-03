package java_Chapter08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**1과 100 사이의 값을 입력하세요 : 5
 * 더 작은 수를 입력하세요. :asdf
 * 1과 100사이의 값을 입력하세요
 * 오류발생
 **/
public class q1_8_8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //1~100사이의 임의의 갑승ㄹ 얻어서 answer에 저장한다.
        int answer =(int)(Math.random() * 100 ) + 1;
        int input = 0; //사용자 입력공간
        int count = 0 ; // 시도횟수
        
        do {
            
            count++;
            System.out.println("1과 100사이의 값을 입력하세요");
            
            try {
                input = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
               System.out.println("유효하지 않은 값입니다 다시 입력하세요");
               continue;
            }
            
            
            if(answer > input) {
                System.out.println("더 큰 수를 입력하세요");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " +  count + "번 입니다.");
                break;
            }
        } while(true);
    }
}
