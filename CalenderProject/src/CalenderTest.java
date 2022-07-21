import java.text.SimpleDateFormat;
import java.util.*;

public class CalenderTest {

	public static void main(String[] args) {
//		Calendar today = Calendar.getInstance();
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH) + 1);	// 0 ~ 11
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		System.out.println(today.get(Calendar.DATE));	//차이는 없음
//		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1(일요일) ~ 7
//		System.out.print(today.get(Calendar.HOUR) + ":");
//		System.out.print(today.get(Calendar.MINUTE) + ":");
//		System.out.println(today.get(Calendar.SECOND));
//		System.out.println(today.getActualMaximum(Calendar.DATE));
		
//		final String[] DAY_OF_WEEK = {" ", "일", "월", "화", "수", "목", "금", "토"};
//		
//		Calendar today = Calendar.getInstance();
//		Calendar lastday = Calendar.getInstance();
//		
//		lastday.set(2021, 0, 1);
//		System.out.println(toString(lastday) + " " + DAY_OF_WEEK[lastday.get(Calendar.DAY_OF_WEEK)]);
//		
//		System.out.println(toString(today) + " " + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)]);
//		//초
//		long diff = today.getTimeInMillis() - lastday.getTimeInMillis(); 
//		diff = diff / 1000;
//		
//		System.out.println("today와 lastday 차이는 " + diff + "초 입니다");
//		//일
//		diff = diff / (24*60*60);
//		System.out.println("today와 lastday 차이는 " + diff + "일 입니다");
		
		//add, roll(그 자리만 바뀜)
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
//		System.out.println("년도 입력 : ");
//		int year = sc.nextInt();
//		System.out.println("달 입력 : ");
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
//		System.out.println("     " + year + " 년 " + month + " 월 ");
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
//			int day = sDay.get(Calendar.DATE); //27일 시작
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
			return (data.get(Calendar.YEAR)) + "년" + (data.get(Calendar.MONTH) + 1) + "월" 
					+ (data.get(Calendar.DATE)) + "일";
		
	}

}
