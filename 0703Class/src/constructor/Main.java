package constructor;

public class Main {

	public static void main(String[] args) {
		// Practice 클래스의 인스턴스 생성
		Practice practice1 = new Practice();
		// practice1.setName("noname");
		System.out.println(practice1.getName());
		Practice practice2 = new Practice();
		// practice2.setName("noname");
		System.out.println(practice2.getName());

		// LEEWOOMI가 출력 됨.
		Practice practice3 = new Practice("LEEWOOMI");
		System.out.println(practice3.getName());

		String str = "Hello World";
		int r = str.lastIndexOf("l");
		int f = str.indexOf("l");

		System.out.println(r);// 9
		System.out.println(f);// 2

		r = str.length();
		System.out.println(r);// 11

		String strr = str.substring(2, 9);
		System.out.println(strr);

		practice1.display();
		
		

	}

}
