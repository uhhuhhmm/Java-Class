package collection.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//ex1
//		Properties prop = new Properties();
//		//key, value ���·� ���� �� �� ����
//		prop.setProperty("timeout", "10");
//		prop.setProperty("lang", "kr");
//		prop.setProperty("size", "30");
//		
//		Enumeration e = prop.propertyNames();
//				//.hasMoreElements ���� �ִ� ���� üũ
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			System.out.println(element + " : " + prop.getProperty(element));
//			//���� ���������
//		}
		
		//ex2
		Properties prop = new Properties();
		String file = "input.txt";
		
		try {
				//������ �� �� �ְ� ��
			prop.load(new FileInputStream(file));
		}catch(IOException e) {
			System.out.println("������ ������ �� ã�ھ�");
		}
		
				//value�޾ƿ�
		String name = prop.getProperty("name");
				//���ڿ��̶� Integer ����Ŭ������ �ٲ�ߵ�
		String[] data = prop.getProperty("data").split(",");
				
				
					
		//���
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
		
		System.out.println(name);//�̸�	
		System.out.println(max);//�ִ밪
		System.out.println(min);//�ּҰ�
		System.out.println(sum);//�հ�
		System.out.println(avg);//���
		
	}

}
