import java.security.PublicKey;

public class Array2Test {

	public static void main(String[] args) {
		// 2���� �迭 : ��� ���� ������ ������
		
//		int[][] arr; // 2���� �迭�� ����
//		arr = new int[5][3]; // ��,�� // 2���� �迭�� ����
		
//		int[][] arr = new int[5][3];	//����� ������ ���ÿ� 
				
//		arr[0][0] = 1; // 2���� �迭�� �ʱ�ȭ
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 4;
		
//		arr[4][2] = 15;
		
//		int[][] arr = {				// ����, ����, �ʱ�ȭ�� ���ÿ�
//						{1,2,3},
//						{4,5,6},
//						{7,8,9},
//						{10,11,12},
//						{13,14,15}
//					  };
		
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[4][2]);
		
		// 2���� �迭 for��
//		for(int i=0; i<5; i++) {			// ���� ũ�⸦ �ݺ�
//			for(int j=0; j<3; j++) {		// ���� ũ�⸦ �ݺ�
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		// 2���� �迭 for�� length
//		for(int i=0; i<arr.length; i++) {		// ���� ũ�⸦ �ݺ� arr.length : ���� ũ��
//			for(int j=0; j<arr[i].length; j++) {// ���� ũ�⸦ �ݺ� arr[0].length : ���� ũ��
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		// 2���� �迭 ���� for��
//		for(int[] ay:arr) {		// ù��° ���� ���� ��������
//			for(int num:ay) {
//				System.out.print(num + "  ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr = {
//						{1,2},
//						{3,4},
//						{5,6},
//						{7,8},
//						{9,10}
//					  };
		
		// 2���� �迭�� ���� ���ϼ��� (�ݺ���)
		//P
//		int sum = 0;
//		for(int[] ay:arr) {
//			for(int num:ay) {
////				System.out.println(num + "   ");
//				sum += num;
//			}
//		}
//		System.out.println(sum);
			
		//����
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				sum += arr[i][j];
//			}
//		}
//		System.out.println(sum);
		
		//int[][] arr = new int[5][3];
		
		//����� �迭�� 1 ~ 15���� ���� �ʱ�ȭ�Ѵ� (�ݺ���)
		//�� ������ ������ ������� �ʴ´�
		//����� ���(��� ������)
		
		//����
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = 3 * i + j + 1;
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		//Ǯ����
//		int[][] arr = new int[2][5];
//		
//		// 1 ~ 10���� �ʱ�ȭ(�ݺ���)
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j]=5*i+j+1;
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}

		//2���� �迭
//		int[][] score = {
//							{30,30,30},
//							{50,50,50},
//							{60,60,60},
//							{70,70,70},
//							{80,80,80},
//						};
//		
//		int sum = 0;
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int totalScore= 0;
//		
//		System.out.println("========================");
//		System.out.println("��ȣ ���� ���� ����  ����   ���");
//		System.out.println("========================");
//		
//		for(int i=0; i<score.length; i++) {
//			kor += score[i][0];
//			eng += score[i][1];
//			math += score[i][2];
//			sum = 0;
//			System.out.print(i + 1 + "  ");
//			
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//				System.out.print(score[i][j] + "  ");
//			}
//			System.out.print(sum + "  ");
//			System.out.print(((float)sum/score[i].length) + "  ");
//			System.out.println();
//		}
//		totalScore = kor + eng + math;
//		System.out.println("========================");
//		System.out.print("����");
//		System.out.print(kor + " " + eng + " " + math + " " + totalScore);
		
		//P
//		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			System.out.print(i + 1 + "  ");
//			
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j]; 
//				System.out.print(score[i][j] + "  ");
//			}
//		}
				
//		========================
//		��ȣ	����	����	����	����	���
//		========================
//		1   30	30	30	90	30.0
//		2	50	50	50	150	50.0
//		3	60	60	60	180	60.0
//		4	70	70	70	210	70.0
//		5	80	80	80	240	80.0
//		========================
//		����	290 290 290 870
		
		//�ݺ��� ����Ͽ� �ʱ�ȭ
		
		
//		int[][] arr = new int [5][5];
//		int num = 1;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(i % 2 == 0) {
//				for(int j=0; j<arr[i].length; j++) {
//					arr[i][j] = num++;	// i*5+j+1
//				}
//			}else {
//				for(int j=arr[i].length-1; j>=0; j--) {
//					arr[i][j] = num++; // i*5+(5-J)
//				}
//			}
//			
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		char[][] star = {							//[4][5]
							{'*','*',' ',' ',' '},
							{'*','*',' ',' ',' '},
							{'*','*','*','*','*'},
							{'*','*','*','*','*'},
						};
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		char[][] star2 = new char[star[0].length][star.length];	// [5][4]
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				/* �ڵ�ϼ� */
				int x=j;
				int y=star.length-1-i; // y=3-i;
				star2[x][y] = star[i][j];
//				star2[i][j] = star[star[0].length-1-j][i];
			}
		}
		
		//star2�� ����Ѵ�.
		
		for(int i=0; i<star2.length; i++) {
			for(int j=0; j<star2[i].length; j++) {
				System.out.print(star2[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
