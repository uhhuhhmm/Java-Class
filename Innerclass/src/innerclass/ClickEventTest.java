package innerclass;

public class ClickEventTest {

	public static void main(String[] args) {
//		ClickEventTest ct = new ClickEventTest();
//		ClickEventTest.ClickEvent cc = ct.new ClickEvent();
//		cc.click();
		
		//익명클래스, 일회용 클래스
		Actionable at = new Actionable() {

			@Override
			public void click() {
				System.out.println("클릭 클릭^^");
			}
		};
		
		at.click();
		
	}
	
//	public class ClickEvent implements Actionable {
//
//		@Override
//		public void click() {
//			System.out.println("클릭 클릭^^");
//		}
//	}
}
