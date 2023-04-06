package Package_3;

import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv>      tvList = new ArrayList<Tv>();
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); 
		// 에러.Product와 Tv가 조상 관계 일지라도 서로 다르면 않된다
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 다형성
		//List는 조상이고 ArrayList는 자손이므로 사용가능 하다 Tv는 일치해야 한다.

		productList.add(new Tv());//Product 자손은 모두 들어 올수 잇다
		productList.add(new Audio());

		tvList.add(new Tv());//Tv 외에는 들어 올수 없다
		tvList.add(new Tv());
//		tvList.add(new Audio());//오류

		printAll(productList);
		// printAll(tvList); // 컴파일 에러가 발생한다. printAll에는 Product 만 가능
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}