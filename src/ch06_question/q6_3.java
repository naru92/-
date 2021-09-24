package ch06_question;

public class q6_3 {
/*
 * 1. : getTotal 메서드명
        기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 : (kor), (eng), (math) .
        반환타입 : int
        매개변수 없음 :

2. : getAverage 메서드명
        기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
        소수점 둘째자리에서 반올림할 것.
        반환타입 : float
        매개변수 없음
  */
}

class Student {
    String name; //학생이름
    int ban; //반
    int no;  //번호
    int kor; //국어
    int eng; //영어
    int math; //수학
    
    Student(){}
    
    public Student(String name, int ban, int no, int kor, int eng, int math) {
      this.name = name;
      this.ban = ban;
      this.no = no;
      this.kor = kor;
      this.eng = eng;
      this.math= math;
    }

    public int getTotal() {
        
        int result = this.kor + this.eng + this.math;
        return result;
    }
    
    public float getAverage () {
        float result = (float)(((this.kor + this.eng + this.math) / 3f * 10 * 0.5)/10f);
        return result;
    }
    
    public String info() {
        int total = getTotal();
        float average = getAverage();
        return name + "," + ban + "," + no + "," + kor + ","+ eng +"," + math +"," + total +"," + average ;
    }
    
    
}

