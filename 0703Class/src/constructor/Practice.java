package constructor;

public class Practice {
	// 가장 처음 한 번 만
	static {
		System.out.println("맨 처음 한번만 수행되는 내용");
		System.out.println("Hello!!!!!!!!");
	}
	// new Practice 할 때 마다
	{
		System.out.println("인스턴트를 만들 때 마다 수행 되는 내용");
	}

	// 생성자
	// public 생성자이름(){}
	public Practice() {

		// 초기화 시켜줌
		name = "noname";
	}

	// 생성자 오버로딩 (동일한 이름의 메소드가 2개 이상 있는 경우)
	public Practice(String irum) {
		name = irum;
	}

	// 이름을 저장하기 위한 인스턴스 변수를 선언
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		String name = "지역변수 name";
		System.out.println(name);
		System.out.println(this.name);//지역변수에서 안 찾고 인스턴스에서 찾음.
	}
}
