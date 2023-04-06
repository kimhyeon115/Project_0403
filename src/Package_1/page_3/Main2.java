package Package_1.page_3;
class Animal2 {
	 public String bark() {
	     return "동물이 웁니다";
	 }
}
public class Main2 {
	 public static void main(String[] args) {
	     // 익명 클래스 : 클래스 정의와 객체화를 동시에. 일회성으로 사용
	     Animal2 dog = new Animal2() {
	     	@Override
	         public String bark() {
	             return "개가 짖습니다";
	         }
	     }; // 단 익명 클래스는 끝에 세미콜론을 반드시 붙여 주어야 한다.	     	
	     // 익명 클래스 객체 사용
	     System.out.println(dog.bark());
	 }
}