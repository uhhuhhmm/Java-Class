package innerclass;

public class ClickEventTest {

	public static void main(String[] args) {
//		ClickEventTest ct = new ClickEventTest();
//		ClickEventTest.ClickEvent cc = ct.new ClickEvent();
//		cc.click();
		
		//�͸�Ŭ����, ��ȸ�� Ŭ����
		Actionable at = new Actionable() {

			@Override
			public void click() {
				System.out.println("Ŭ�� Ŭ��^^");
			}
		};
		
		at.click();
		
	}
	
//	public class ClickEvent implements Actionable {
//
//		@Override
//		public void click() {
//			System.out.println("Ŭ�� Ŭ��^^");
//		}
//	}
}
