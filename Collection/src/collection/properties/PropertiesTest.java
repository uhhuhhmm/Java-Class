package collection.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//ex1
//		Properties prop = new Properties();
//		//key, value 형태로 저장 할 수 있음
//		prop.setProperty("timeout", "10");
//		prop.setProperty("lang", "kr");
//		prop.setProperty("size", "30");
//		
//		Enumeration e = prop.propertyNames();
//				//.hasMoreElements 값이 있는 없는 체크
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			System.out.println(element + " : " + prop.getProperty(element));
//			//순서 지마음대로
//		}
		
		//ex2
		Properties prop = new Properties();
		String file = "input.txt";
		
		try {
				//파일을 쓸 수 있게 됨
			prop.load(new FileInputStream(file));
		}catch(IOException e) {
			System.out.println("지정된 파일을 못 찾겠어");
		}
		
				//value받아옴
		String name = prop.getProperty("name");
				//문자열이라 Integer 래퍼클래스로 바꿔야됨
		String[] data = prop.getProperty("data").split(",");
				
				
					
		//출력
		int[] score = new int[data.length];
		
		for(int i = 0; i < data.length; i++) {
			score[i] = Integer.parseInt(data[i]);
		}
		
		int max, min;
		
		int sum = 0;
		double avg = 0;
		max = min = score[0];
		
		for(int i = 0; i < data.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			
			if(min >  score[i]) {
				min = score[i];

			}
			
			sum += score[i];
		}
		
		avg = (double)sum / score.length;
		
		System.out.println(name);//이름	
		System.out.println(max);//최대값
		System.out.println(min);//최소값
		System.out.println(sum);//합계
		System.out.println(avg);//평균
		
	}

}
