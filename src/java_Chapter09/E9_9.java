package java_Chapter09;

public class E9_9 {
    
    public static String delChar(String src, String delCh) {
        StringBuffer s = new StringBuffer();
        
        return "";
    }
    
    public static void main(String[] args) {
        
        System.out.println("(1!2@3^4~5)"+ " => " + delChar("(1!2@3^4~5)", "~!@#$%^&*()") );
        System.out.println("(1            2   3 4\t5)"+" -> " + delChar("(1 2 3 4\t5)"," \t"));
                
    }
}
