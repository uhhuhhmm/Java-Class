package lambdaProject;

public class LambdaEx2Test {

	public static void main(String[] args) {
		MyFunction2 f1 = () -> System.out.println("f1.run()");
		
		MyFunction2 f2 = new MyFunction2() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		}; 
		
		LambdaEx2 lm2 = new LambdaEx2();
		
		MyFunction2 f3 = lm2.getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		lm2.execute(f1);
		lm2.execute(() -> System.out.println("run()"));
	}

}
