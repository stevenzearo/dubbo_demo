


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProvider.xml");
		context.start();
		System.out.println(">>>>>>>>dubbo starting......");
		System.in.read();

	}
}