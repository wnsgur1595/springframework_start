package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 {
	public static void main(String[] args) {
		// exam2에서는 xml파일을 읽어와야했기 때문에 new ClassPathXmlApplicationContext("applicationContext.xml")를 사용했지만,
		// exam3은 javaConfig를 사용할 것이기 때문에 new AnnotationConfigApplicationContext(ApplicationConfig.class)를 사용했다.
		// spring 공장을 세움
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// 아래코드를 보면, Car.class를 매개변수로 넣었다.
		// 원래라면, ApplicationConfig.java파일에 있는 함수이름인 "car"가 들어가야하는데,
		// Car.class를 써서 이를 대체한 것이다. ( 오타 및 메소드 이름의 변경 등에 자유로움 )
		// 반환 타입이 Car인 메소드를 호출
		Car car = (Car)ac.getBean(Car.class);
		// Car car = (Car)ac.getBean("car");
		car.run();
	}

}
