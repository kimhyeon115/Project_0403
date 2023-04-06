package Package_2.lumda;
@FunctionalInterface
interface Myfunction2{
	int calc(int x);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaEx2 ld = new LambdaEx2();
		ld.Lambda();
	}
	public void Lambda() {
		Myfunction2 ff = new Myfunction2() {
			public int calc(int x) {
				return x*x;
			}
		};
		System.out.println(ff.calc(5));
	}	
}