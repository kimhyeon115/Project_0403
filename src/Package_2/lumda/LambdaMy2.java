package Package_2.lumda;
@FunctionalInterface
interface MyInterface{
	int calcs(int x, int y, int z);
}
public class LambdaMy2 {

	public static void main(String[] args) {
		MyInterface mm = new MyInterface() {
			public int calcs(int x, int y, int z) {
				return (x+y)*z;
			}
		};
		System.out.println(mm.calcs(1, 3, 5));
		
		MyInterface nn = (x, y, z) -> { return (x+y)*z;};
		System.out.println(nn.calcs(5, 3, 1));
	}
}