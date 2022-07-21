package lambdaProject;

@FunctionalInterface
public interface MyFunction3<T> { //제네릭 타입 T를 가진 함수형 인터페이스
	void accept(T x); // 람다식으로 구현할 추상 메소드
	
	
}
