package Package_1.page_1;
class lunch {
	public String lunch77()	{
		String s1 = "점심 맛있게 먹었나요?";
		return s1;
	}
}
public class today {
	public static void main(String[] args) {
		lunch l = new lunch() {
			public String lunch77() {
				String f = "순대국 먹었어요";
				return f;
			}
		};
		System.out.println(l.lunch77());
	}
}
