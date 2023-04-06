package Package_1.page;

public class Page_181 {
	int a = 80;
	static int b = 90;
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.add(50L, 70L));
		Page_181 p = new Page_181();
		System.out.println(p.a + b);			//같은 클래스내에서의 스태틱변수는 클래스명 생략가능
		System.out.println(mm.c + MyMath.d);	//다른 클래스의 스태틱변수 사용시 해당 클래스 변수명사용해야함
	}
}
class MyMath {
	int c = 40;
	static int d = 30;
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
}