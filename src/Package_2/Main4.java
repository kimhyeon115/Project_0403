package Package_2;
class Animal4 {
	public String bark() {
	     return "동물이 웁니다";
	}
}

public class Main4 {
	public static void main(String[] args) {
		 Main4 dd = new Main4();
	     dd.method();
	}
	public void method() {
		 Animal4 dog = new Animal4() {
	         // @Override 메소드
	         public String bark() {
	             return "개가 짖습니다";
	         }
	     };
	     System.out.println(dog.bark());
	}
}