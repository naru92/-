package ch06_question;

public class q6_1 {
    
}

 class StudaCard {
    private int num = 1;
    private boolean isKwang = true ;
    
    StudaCard() {}
    StudaCard (int num , boolean isKwang){
       this.num = num;
       this.isKwang = isKwang;
      
    }
    
    public String  info() {
        if(isKwang) {
        return num + "K이 출력된다.";
        }else {
        return num + "이 출력된다.";   
        }
    }
    
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        if(num > 0 && num <= 10) {
            this.num = num;
        }
    }
    
    public void setIsKwang(boolean Kwang) {
       this.isKwang = Kwang;
    }
    
    public boolean getIsKwang() {
        return this.isKwang;
    }
}