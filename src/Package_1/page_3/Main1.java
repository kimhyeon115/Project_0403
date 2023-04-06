package Package_1.page_3;
class Animal1 {
	 public String bark() {
	     return "동물이 웁니다";
	 }
}
	//자식 클래스
class Dog extends Animal1 {
		@Override
	 public String bark() {
	     return "개가 짖습니다";
	 }
}
public class Main1 {
	 public static void main(String[] args) {
	     Animal1 a = new Dog();
	     System.out.println(a.bark());
	 }
}