
public class Point3D extends Point2 {
//	int x = 100;
//	int y = 200;
	int z;
	
//	Point3D(){
//		super(); //super �θ�
//				 //this �ڱ��ڽ�
//	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);	//�ڽ� �����ڿ��� �θ� �����ڸ� ȣ���������,���� ù��°���ο� ����
		this.z = z;
	}
	
	//�޼ҵ� �������̵�
	//1. ��Ӱ��谡 �ʼ�
	//2. �޼ҵ� �̸��� �Ű����� ���°� ���� ����
	String getLocation() {	//�޼ҵ� �������̵�
		return x + ", " + y + ", " + z;
	}
	
	

	void smethod() {
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.x);
		System.out.println(this.y);
	}

}
