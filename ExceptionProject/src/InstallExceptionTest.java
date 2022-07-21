
public class InstallExceptionTest {
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("공간 확보 후 다시 설치");
		}catch(MemoryException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("메모리 확보 후 다시 설치");
		}finally {
			deleteTempFile();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치 공간 부족");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("메모리 공간 부족");
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
		System.out.println("설치 파일 삭제 완료");
	}
	
}
