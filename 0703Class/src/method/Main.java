package method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Member Class Instance 
		Member member = new Member();
		//인스턴스 변수를 호출해서 데이터 저장
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("email= ");
		member.setEmail(sc.nextLine());
		System.out.print("\npassword = ");
		member.setPassword(sc.nextLine());
		System.out.print("\nname = ");
		member.setName(sc.nextLine());
		System.out.print("\nid = ");
		member.setId(sc.nextLine());
		System.out.print("\nage = ");
		member.setAge(sc.nextInt());
		System.out.print("\nphone = ");
		member.setPhone(sc.next());
		
		sc.close();
		//display 메소드 불러오기
	//	member.display();
		System.out.println(member);
		
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10,20));
		System.out.println(Member.sum(10,20,30,40));

		long m = Math.max(10, 30);
		System.out.println(m);
		
		long min =Math.min(30, 3);
		System.out.println(min);
	}

}
