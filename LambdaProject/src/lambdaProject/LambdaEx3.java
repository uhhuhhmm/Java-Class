package lambdaProject;

public class LambdaEx3 {
	public static void main(String[] args) {
		MyFunction3<String> f1 = (x) -> System.out.println(x.toString());
		f1.accept("ABC"); //String 객체를 람다식에 넘겨준다
		
		MyFunction3<Integer> f2 = (x) -> System.out.println(x.toString());
		f2.accept(Integer.valueOf(100)); //Integer 객체를 람다식에 넘겨준다
	}
}
