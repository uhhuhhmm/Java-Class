package collection.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		//Set �����͸� ������� �������� �ʰ� �����ϰ� ����
//		Object[] objArr = {new Integer(1), "1", "2","2","3","3","4","4","4"};
//		//������ Ư¡ �ߺ��� ������� ����
//		HashSet set = new HashSet();	//import ctrl + shift + o
//		
//		for(int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set);
//		//Integer 1,  String 1 �̶� 1 1 2�� ���
		
		//�ζ� �ߺ� ���ֱ�
//		HashSet set = new HashSet();
//		
//		for(int i = 0; set.size() < 6; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			set.add(lotto);		//Autoparking
//		}
//		
//		System.out.println(set);
		
		//���� ����
		//��, �迭 ����, 1 ~ 50���� ���� ���� ��ġ, 25�� ���� ���
		HashSet set = new HashSet(); //�ߺ����� ����
		int[][] bmap = new int[5][5];
		
		for(int i = 0; set.size() < 25; i++) {
			set.add((int)(Math.random() * 50) + 1);
		}
		
		
//		while(it.hasNext()) {
//			int num = (int)it.next(); //25�� ����
//			System.out.println(num);
//		}
		
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list);
		Iterator it = list.iterator();
		
	
		for(int i = 0; i < bmap.length; i++) {
			for(int j = 0; j < bmap[i].length; j++) {
				bmap[i][j] = (int)it.next();
			}
		}
		
		for(int i = 0; i < bmap.length; i++) {
			for(int j = 0; j < bmap[i].length; j++) {
				System.out.print(bmap[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("===================");
		
		//���� ����
		run(bmap);
		
	
	}

	public static void run(int[][] bmap) {
		System.out.println("���� ����");
		
		boolean go = true;
		Scanner sc = new Scanner(System.in);

		while(go) {
			System.out.println("1 ~ 50������ ���ڸ� �Է��ϼ���");
			System.out.print(">> ");
			int bingo = sc.nextInt();
			
			for(int i = 0; i < bmap.length; i++) {
				for(int j = 0; j < bmap.length; j++) {
					if(bmap[i][j] == bingo) {
						bmap[i][j] = 0;
					}
				}
			}
			
			//���� Ȯ��, Ȯ�� �뵵
			for(int i = 0; i < bmap.length; i++) {
				for(int j = 0; j < bmap.length; j++) {
					System.out.print(bmap[i][j] + "  ");
				}
				System.out.println();
			}
			//������ ������ ������ ���� ���
			for(int i = 0; i < bmap.length; i++) {
				int sum = 0;
				for(int j = 0; j < bmap[i].length; j++) {
					sum += bmap[i][j];
				}
				if(sum == 0) {
					go = false;
					System.out.println("V I C T O R Y");
					break;
				}
			}
			//����
			for(int i = 0; i < bmap.length; i++) {
				int sum = 0;
				for(int j = 0; j < bmap[i].length; j++) {
					sum += bmap[j][i];
				}
				if(sum == 0) {
					go = false;
					System.out.println("V I C T O R Y");
					break;
				}
			}
			
			//�밢��
			for(int i = 0; i < bmap.length; i++) {
				int sum = 0;
				for(int j = 0; j < bmap[i].length; j++) {
					sum += bmap[j][j];
				}
				if(sum == 0) {
					go = false;
					System.out.println("V I C T O R Y");
					break;
				}
			}
			
			for(int i = 0; i < bmap.length; i++) {
				int sum = 0;
				for(int j = 0; j < bmap[i].length; j++) {
					sum += bmap[i][i];
					
				}
				if(sum == 0) {
					go = false;
					System.out.println("V I C T O R Y");
					break;
				}
			}
			
		}	
	}
	
	
	
}
