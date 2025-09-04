package polymorphism3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// Spring 컨테이너를 생성한다.
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Spring 컨테이너로부터 필요한 객체를 얻어낸다.
		TV tv = (TV) container.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// Spring 컨테이너를 종료한다.
		container.close();
	}
}
