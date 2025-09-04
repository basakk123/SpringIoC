package polymorphism3;

public class GoogleTV implements TV {
	private SonySpeaker speaker;
	private int price;
	
	public GoogleTV() {
		System.out.println("===> GoogleTV(1) 생성");
	}
	
	public GoogleTV(SonySpeaker speaker) {
		System.out.println("===> GoogleTV(2) 생성");
		this.speaker = speaker;
	}
	
	public GoogleTV(SonySpeaker speaker, int price) {
		System.out.println("===> GoogleTV(3) 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn() {
		System.out.println("GoogleTV---전원 켠다." + price);
	} 
	public void powerOff() {
		System.out.println("GoogleTV---전원 끈다.");
	} 
	public void volumeUp() {
		speaker.volumeUp();
	} 
	public void volumeDown() {
		speaker.volumeDown();
	} 
}
