package lambdaProject;

public class LambdaEx2 {
	void execute(MyFunction2 f) {
		f.run();
	}
	
	MyFunction2 getMyFunction() {
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
}
