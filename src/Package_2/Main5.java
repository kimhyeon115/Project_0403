package Package_2;
//메소드 아규먼트에 익명 클래스 자체를 입력으로 할당
//부모 클래스
class Animal5 {
	public String bark() {
		return "동물이 웁니다";
	}
}
class Creature {
	public void method(Animal5 dog) {
		//익명 객체를 매개변수로 받아 사용
		System.out.println(dog.bark());
	}
}
public class Main5 {
	public static void main(String[] args) {
		// 익명 클래스 : 클래스 정의와 객체화를 동시에. 일회성으로 사용
		Creature monster = new Creature();
	 	//메소드 아규먼트에 익명 클래스 자체를 입력으로 할당
		monster.method(new Animal5() {
			public String bark() {
				return "개가 짖습니다";
			}
		}); 
	}
}