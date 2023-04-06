package Package_2.lumda;
@FunctionalInterface
interface MyFunction3 {
	void print();							//매개변수 없는 메소드
}
public class LambdaEx3 {
//	MyFunctionEx3 fprint = new MyFunctionEx3() {
//		public void print() {
//			System.out.println("Yoon's Dev");
//		}
//	};
public LambdaEx3() {
	MyFunction3 fprint = () -> {System.out.println("Yoon's Dev");};
	fprint.print();
}
	public static void main(String[] args) {
		new LambdaEx3();					//생성자 이용
	}
}
