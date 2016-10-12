package exDI_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Driver driver1 = (Driver) context.getBean("driver1");
		driver1.drive();
		
		Driver driver2 = (Driver) context.getBean("driver2");
		driver1.drive();
	}
}