package Package_2.lumda;
//인자 x, y를 받아들여 x+y를 리턴하는 람다식 만들기
//함수형 인터페이스
@FunctionalInterface
interface MyFunction {
	  int calc(int x, int y);
	}
public class LambdaEx {
	  
	 public LambdaEx() {
//	      MyFunction f = new MyFunction() {
	//
//	          @Override
//	          public int calc(int x, int y) {
//	              return x+y;
//	          }
//	          
//	      };
	      
	      MyFunction f1 = (x, y) -> {return x+y;};
	      System.out.println("f1의 결과: " + f1.calc(22, 100));
	      
	      MyFunction f2 = (x, y) -> {return x-y;};
	      System.out.println("f2의 결과: " + f2.calc(99, 9));
	      
	      MyFunction f3 = (x, y) -> {return x*y;};
	      System.out.println("f3의 결과: " + f3.calc(8, 30));
	  }

	  public static void main(String[] args) {
		  new LambdaEx();//LambdaEx gg = new LambdaEx(); 생성자 실행
	  }
}