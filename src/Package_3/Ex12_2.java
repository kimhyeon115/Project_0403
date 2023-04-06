package Package_3;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));

		Iterator<Student> it = list.iterator();
		//iterator는 ArrayList, HashSet과 같은 컬렉션을 반복하는 데 사용할 수 있는 객체다. 
		//Iterator의 장점
		//1. 컬렉션에서 요소를 제어하는 기능
		//2. next() 및 previous()를 써서 앞뒤로 이동하는 기능
		//3. hasNext()를 써서 더 많은 요소가 있는지 확인하는 기능
		while (it.hasNext()) {
		//  Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
			Student s = it.next();
			System.out.println(s.name);
		}
		
		// for-each문을 사용한 경우
        for (Student str : list)
        {
            System.out.println(str.name+","+str.ban+","+str.no);
        }
	} // main
}

class Student {
	String name = "";
	int ban;
	int no;

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}