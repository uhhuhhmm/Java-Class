package collection.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		//Set 데이터를 순서대로 저장하지 않고 랜덤하게 저장
//		Object[] objArr = {new Integer(1), "1", "2","2","3","3","4","4","4"};
//		//결정적 특징 중복을 허용하지 않음
//		HashSet set = new HashSet();	//import ctrl + shift + o
//		
//		for(int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set);
//		//Integer 1,  String 1 이라서 1 1 2번 출력
		
		//로또 중복 없애기
//		HashSet set = new HashSet();
//		
//		for(int i = 0; set.size() < 6; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			set.add(lotto);		//Autoparking
//		}
//		
//		System.out.println(set);
		
		//빙고 게임
		//맵, 배열 숫자, 1 ~ 50까지 숫자 랜덤 배치, 25개 숫자 출력
		HashSet set = new HashSet(); //중복성을 없앰
		int[][] bmap = new int[5][5];
		
		for(int i = 0; set.size() < 25; i++) {
			set.add((int)(Math.random() * 50) + 1);
		}
		
		
//		while(it.hasNext()) {
//			int num = (int)it.next(); //25번 돈다
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
		
		//게임 시작
		run(bmap);
		
	
	}

	public static void run(int[][] bmap) {
		System.out.println("빙고 시작");
		
		boolean go = true;
		Scanner sc = new Scanner(System.in);

		while(go) {
			System.out.println("1 ~ 50사이의 숫자를 입력하세요");
			System.out.print(">> ");
			int bingo = sc.nextInt();
			
			for(int i = 0; i < bmap.length; i++) {
				for(int j = 0; j < bmap.length; j++) {
					if(bmap[i][j] == bingo) {
						bmap[i][j] = 0;
					}
				}
			}
			
			//숫자 확인, 확인 용도
			for(int i = 0; i < bmap.length; i++) {
				for(int j = 0; j < bmap.length; j++) {
					System.out.print(bmap[i][j] + "  ");
				}
				System.out.println();
			}
			//가로줄 한줄이 맞으면 성공 출력
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
			//세로
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
			
			//대각선
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
