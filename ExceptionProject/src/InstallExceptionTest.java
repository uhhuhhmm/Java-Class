
public class InstallExceptionTest {
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("���� Ȯ�� �� �ٽ� ��ġ");
		}catch(MemoryException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("�޸� Ȯ�� �� �ٽ� ��ġ");
		}finally {
			deleteTempFile();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("��ġ ���� ����");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("�޸� ���� ����");
		}
	}
	
	static boolean enoughSpace() {
		
		return false;
	}
	
	static boolean enoughMemory() {
		
		return true;
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFile() {
		System.out.println("��ġ ���� ���� �Ϸ�");
	}
	
}
