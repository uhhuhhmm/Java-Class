import java.text.SimpleDateFormat;
import java.util.*;

public class CalenderTest {

	public static void main(String[] args) {
//		Calendar today = Calendar.getInstance();
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH) + 1);	// 0 ~ 11
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		System.out.println(today.get(Calendar.DATE));	//���̴� ����
//		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1(�Ͽ���) ~ 7
//		System.out.print(today.get(Calendar.HOUR) + ":");
//		System.out.print(today.get(Calendar.MINUTE) + ":");
//		System.out.println(today.get(Calendar.SECOND));
//		System.out.println(today.getActualMaximum(Calendar.DATE));
		
//		final String[] DAY_OF_WEEK = {" ", "��", "��", "ȭ", "��", "��", "��", "��"};
//		
//		Calendar today = Calendar.getInstance();
//		Calendar lastday = Calendar.getInstance();
//		
//		lastday.set(2021, 0, 1);
//		System.out.println(toString(lastday) + " " + DAY_OF_WEEK[lastday.get(Calendar.DAY_OF_WEEK)]);
//		
//		System.out.println(toString(today) + " " + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)]);
//		//��
//		long diff = today.getTimeInMillis() - lastday.getTimeInMillis(); 
//		diff = diff / 1000;
//		
//		System.out.println("today�� lastday ���̴� " + diff + "�� �Դϴ�");
//		//��
//		diff = diff / (24*60*60);
//		System.out.println("today�� lastday ���̴� " + diff + "�� �Դϴ�");
		
		//add, roll(�� �ڸ��� �ٲ�)
//		Calendar date = Calendar.getInstance();
//		date.set(2015, 7, 31);
//		System.out.println(toString(date));
//		
//		date.add(Calendar.DATE, 1);
//		System.out.println(toString(date));
//		
//		date.add(Calendar.MONTH, -6);
//		System.out.println(toString(date));
//		
//		date.roll(Calendar.DATE, 31);
//		System.out.println(toString(date));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�⵵ �Է� : ");
//		int year = sc.nextInt();
//		System.out.println("�� �Է� : ");
//		int month = sc.nextInt();
//		
//		Calendar sDay = Calendar.getInstance();
////		Calendar eDay = Calendar.getInstance();
//				
//		sDay.set(year, month - 1, 1);
////		eDay.set(year, month, 1);
//		
////		eDay.add(Calendar.DATE, -1);
//		
//		int START_DAY_WEEK = 0;
////		int END_DAY = 0;
//		
//		START_DAY_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
////		END_DAY = eDay.get(Calendar.DATE);
//		sDay.add(Calendar.DATE, -(START_DAY_WEEK - 1));
//		
//		System.out.println("     " + year + " �� " + month + " �� ");
//		System.out.println(" SU MO TU WE TH FR SA");
//		
//		
////		for(int i = 1; i < START_DAY_WEEK; i++) {
////			System.out.print("   ");
////		}
//		
//		
//		
////		for(int i = 1, n = START_DAY_WEEK; i <= END_DAY; i++, n++) {
////			System.out.print((i < 10 ? "  " + i :" " + i));
////			if(n % 7 == 0) 
////				System.out.println();
////		}
//		
//		for(int i = 1; i <= 42; i++) {
//			int day = sDay.get(Calendar.DATE); //27�� ����
//			System.out.print(( day < 10 ? "  " + day :" " + day));
//			sDay.add(Calendar.DATE, 1);
//			
//			if(i % 7 == 0) 
//				System.out.println();
//			
//		}
		
		Calendar date = Calendar.getInstance();
		Date day = date.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf1.format(day));
		
	}
		
		public static String toString(Calendar data) {
			return (data.get(Calendar.YEAR)) + "��" + (data.get(Calendar.MONTH) + 1) + "��" 
					+ (data.get(Calendar.DATE)) + "��";
		
	}

}
