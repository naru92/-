package java_Chapter07_q7_11;

//셋채널 해서 디스채널 해서 prev

class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel = 0;
    
    public boolean isPowerOn() {
     return isPowerOn;
 }
 public void setPowerOn(boolean isPowerOn) {
     this.isPowerOn = isPowerOn;
 }
 public int getChannel() {
    
     return channel;
 }
 public void setChannel(int channel) {
     prevChannel = this.channel;
     this.channel = channel;
     
 }
 public int getVolume() {
     return volume;
 }
 public void setVolume(int volume) {
     this.volume = volume;
 }
 final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL= 100;
    final int MIN_CHANNEL = 1;

    public void gotoPrevChannel() {
       int temp = channel;
       this.channel = prevChannel;
       prevChannel = temp;
    }
 }


 public class Exercise7_11 {
     public static void main(String[] args) {
         MyTv2 t = new MyTv2();
         
         t.setChannel(10);
         System.out.println("CH:" + t.getChannel());
         t.setChannel(20);
         System.out.println("CH:" + t.getChannel());
         t.gotoPrevChannel();
         System.out.println("CH:" + t.getChannel());
         t.gotoPrevChannel();
         System.out.println("CH:" + t.getChannel());
     }
 }