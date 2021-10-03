package java_Chapter07_q7_14;



class SutdaCard{
    //final 
    private final int num;
    private final boolean isKwang;
    
    public SutdaCard() {
        this(1, true);
    }
    
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    
    public String toString() {
        return num + (isKwang ? "K": ""); 
    }
    
}


public class Exercise7_14 {
    SutdaCard card = new SutdaCard(1, true);
}
