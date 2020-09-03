package kr.or.connect.diexam01;

public class UserBean {
	// bean은 다음과 같은 세가지 특징을 가지고 있어야함.
	// 1) 기본생성자를 가져야함.
	// 2) 필드는 private하게 선언함.
	// 3) getter, setter 메소드를 가져야함. getName() setName() 메소드를 name 프로퍼티(property)라고 함. ( 용어 중요함 )
	
	
	private String name;
	private int age;
	private boolean male;
	
	public UserBean() {}
	
	public UserBean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
}
