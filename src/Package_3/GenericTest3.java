package Package_3;
import java.util.ArrayList;

public class GenericTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//int의 Wrapper 클래스인 Interger나 String을 사용하여 제네릭해야 한다
		//Integer나, String만 사용하도록 지정 이것이 제네릭스이다
		list.add(10);
		list.add(20);
//		list.add("30");
		Integer integer = (Integer)list.get(2);//2번째 즉 “30”을 꺼내려고한다.
		System.out.println(list);
	}
}