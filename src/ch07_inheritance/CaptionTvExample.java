package ch07_inheritance;

class Tv{
	boolean power; //전원 상태
	int channel; //채널
	
	void power() { //전원 켜기/끄기
		power = !power;
	}
	
	void channelUp() {//채널 업
		channel++;
	}
	
	void channelDown() {//채널 다운
		channel--;
	}
}

class CaptionTv extends Tv{
	//Tv의 모든 변수와 메서드를 가지고 있는상태
	// +
	boolean cation; //캡션상태 
	void displayCation(String text) {
		if(cation) {
			System.out.println(text); //캡션이 true라면 text를 보여준다.
		}
	}
}

public class CaptionTvExample {
	public static void main(String[] args) {
		CaptionTv cTv = new CaptionTv();
		cTv.channel = 10;
		cTv.channelUp(); //11
		System.out.println(cTv.channel);
		cTv.displayCation("Hello, World");
		cTv.cation = true; //캡션을 켠다
		cTv.displayCation("Hello, World");
	}
}
