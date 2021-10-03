package java_Chapter09;

public class E9_4 {
    
    static void printGraph(int[] dataArr, char ch) {
        //기능: 주어진 배열에 담긴 값만큼 주어진 문자를 가로로 출력한 후 , 값을 출력한다.
        //반환타입 : 없다
        // 매개변수 int[] dataArr - 출력할 그래프의 데이터
        //char ch - 그래프로 출력할 문자.
        String resultChar = "";
        for(int data : dataArr) {
            for(int i=0 ; i< data ; i++) {
                resultChar += '*';
            }
            resultChar += data;
            System.out.println(resultChar);
            resultChar= "";
        }
       
    }
    
    
    public static void main(String[] args) {
        printGraph(new int[] {3,7,1,4}, '*');
    }
}
