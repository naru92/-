package ch06_question;

import java.util.Arrays;
import java.util.Random;

public class q6_20 {

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    /*
     * 메서드명 : shuffle 기 능 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다 : . 처리한 배열을 반환한다.
     * 반환타입 : int[] 매개변수 정수값이 담긴 배열
     */

    static int[] shuffle(int[] arr) {
        Random r = new Random();
        
        if(arr == null || arr.length == 0) {
            return arr;
        }
            for(int i=0; i< arr.length;i++) {
                int j = r.nextInt(arr.length);
                
                int number = arr[i];
                arr[i] = arr[j];
                arr[j] = number;
            }

            return arr;
        }
    
}