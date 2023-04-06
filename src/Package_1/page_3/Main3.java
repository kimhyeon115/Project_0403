package Package_1.page_3;
class Animal3 {
	 public String bark() {
	     return "동물이 웁니다";
	 }
}
public class Main3 {
	 public static void main(String[] args) {
	     Animal3 dog = new Animal3() {
	         // @Override 메소드
	         public String bark() {
	             return "개가 짖습니다";
	         }	         
	         // 새로 정의한 메소드
	         public String run() {
	             return "달리기 ㄱㄱ싱";
	         }
	     };	     
	     System.out.println(dog.bark());
//	     dog.run(); // ! Error - 외부에서 호출 불가능
	 }
}