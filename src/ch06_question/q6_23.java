package ch06_question;

import java.util.Arrays;

public class q6_23 {
    /*
      메서드명 : max
      기 능 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다
      만일 주어진 배열이 null이거나 크기가 0인 경우 -999999를 반환한다 .
      반환타입 : int
      매개변수 int[] arr - 최대값을 구할 배열
     
    */
    static int max(int[] arr) {
        if(  arr == null || arr.length == 0  ) {
            return -999999;
        }
      Arrays.sort(arr);
      return arr[arr.length - 1];
    }
    
    public static void main(String[] args) {
        
        int result1 = max(new int[]{3,13,6,4,1,2,8});
        int result2 = max(null);
        int result3 = max(new int[]{});
      
        System.out.println("결과1 : " +result1);
        System.out.println("결과2 : " + result2);
        System.out.println("결과3 : " +result3);
        
    }
}
