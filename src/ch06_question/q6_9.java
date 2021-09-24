package ch06_question;

public class q6_9 {  
}

class Marine {
    int x = 0 , y= 0; //위치 - 서로 상이할수 있음
    int hp = 60; //체력 - 피가 닳아있을수 있음
    
    static int weapon = 6; // 공격력 똑같음
    static int armor = 0; //방어력 똑같음
    
    static void weaponUp() { //같이 올라감 
        weapon++;
    }
    static void armorUp() { //같이 올라감
        armor++;
    }
    
    void move(int x, int y) { //따로 이동
        this.x = x;
        this.y = y;
    }
}