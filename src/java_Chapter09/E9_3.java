package java_Chapter09;

public class E9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";
        
        path = fullPath.substring(0,14);
        fileName =fullPath.substring(15);
   
        //마지막 \\인덱스를 찾아서 그거 기준으로 짜름
        
        
        
        System.out.println("fullPath " + fullPath);
        System.out.println("path " + path);
        System.out.println("fileName " + fileName);
    }
}
