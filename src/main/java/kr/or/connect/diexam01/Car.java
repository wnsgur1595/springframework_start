package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	// Engine이라는 객체가 생성되면 알아서 v8에 넣어달라. 따라서 setEngine이 필요없음.
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
	// @Component와 @Autowired가 붙어서 없애도 됨.
	// 하지만 없애면 ApplicationConfig.java에서 에러가 난다.
	// 그렇다고 남겨놓자니 ApplicationContextExam04.java에서는 ApplicationConfig2를 사용하고, 여기에서는 
	// Component를 사용해서 자동으로 Bean으로 주입하게 했으므로, @Configuration이 붙은 ApplicationConfig.java도 살피게 된다.
	// 그래서 만약 ApplicationConfig.java에서 Bean으로 등록된 메소드의 반환타입이 Car이고, 이름이 car가 아닌 다른 cor, caar 등이었다면,
	// 충돌을 일으키게 된다. ( 왜냐하면 Car class도 Component로 등록이 되었으므로, car라는 이름이 있기 때문이다. )
	// 참고로 클래스 이름의 맨 앞글자를 소문자로 바꾼것을 기본으로 한다.
	
	public void setEngine(Engine e) {
		this.v8 = e;
	}
	
	
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec();
	}
	
//	public static void main(String[] args) {
//		Engine e = new Engine();
//		Car c = new Car();
//		c.setEngine(e);
//		c.run();
//	}
}
