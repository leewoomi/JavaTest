package method;

public class Member {

	private String email;
	private String password;
	private String name;
	private String id;
	private int age;
	private String phone;

	// 인스턴스 변수들을 출력해주는 메소드
	// 클래스 안에서 클래스에 만들어진 변수를 사용 할 때는
	// 인스턴스나 클래스 이름을 기재하지 않습니다.
	public void display() {
		System.out.println("age = " + getAge() + "\nemail = " + email + "\nid = " + id + "\nname = " + name
				+ "\npassword = " + password + "\nphone = " + phone);
	}

	// toString
	@Override
	public String toString() {
		return "Member [email=" + email + ", password=" + password + ", name=" + name + ", id=" + id + ", age=" + age
				+ ", phone=" + phone + "]";
	}
//setter getter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// age의 getter
	public int getAge() {
		return age;
	}

	// age의 setter
	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//static 메소드 : 클래스 이름으로 호출할 수 있는 메소드
	//매개변수에 ...이 있으면 매개변수 개수에 상관 없이
	//대입가능
	public static int sum(int ... ar) {
		//int ... : 정수 몇개를 줘두 됨
		int total = 0;
		//heap에 있는 데이터를 stack에 저장
		//자주 사용하기 때문에 heap에 있는 효율이 떨어짐
		int len = ar.length;
		
		for(int i =0; i<len;i++) {
			total +=ar[i];
		}
		return total;
	}
}
