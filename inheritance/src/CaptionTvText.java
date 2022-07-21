
public class CaptionTvText {

	public static void main(String[] args) {

//		CaptionTV ctv = new CaptionTV();
//		ctv.channel = 10;
//		ctv.channelUp();
//		System.out.println(ctv.channel);
//		ctv.displayCaptionString("Hello World");	
//		ctv.caption = true;
//		ctv.displayCaptionString("Hello World");	
		
		SmartTV stv = new SmartTV();
		stv.channel = 20;
		stv.channelDown();
		System.out.println(stv.channel);
		stv.smartStart();
		stv.smart = true;
		stv.smartStart();
		
		stv.volum = 10;
		stv.volumUp();
		System.out.println(stv.volum);
//		stv.volumDown();
//		System.out.println(stv.volum);
	}

}
