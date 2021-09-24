package ch06_question;

public class q6_19 {
    
    public static void change(String str) {
        str += "456";
    }
    
    public static void main(String[] args) {
    
        String str = "ABC123";
        
        System.out.println(str);
        change(str);
        System.out.println("After change:"+ str);
    }
    
    //ABC123
}


