package java_Chapter08;

public class q1_8_10 {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println(6);
        } catch (Exception e) {
            System.out.println(7); //7출력
        }
    }
    
    static void method1() throws Exception {
        try {
            method2();//널 포인트 발생
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println(2); // 2출력
            throw e;
        }catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4); //2출력 종료후 finally 실행 4출력
        }
        System.out.println(5);
    }
    
    static void method2() {
       throw new NullPointerException();
    }
}
