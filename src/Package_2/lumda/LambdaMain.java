package Package_2.lumda;
@FunctionalInterface
interface InterfaceMy {
	int add(int x, int y);
}
public class LambdaMain {

	public static void main(String[] args) {
//		InterfaceMy ss = new InterfaceMy() {		//익명클래스
//			public int add(int x, int y) {
//				return x + y;
//			}
//		};
//		System.out.println(ss.add(77,99));
		
		InterfaceMy ss = (x,y) -> {return x+y;};	//람다식
		System.out.println(ss.add(77,99));
	}
}
