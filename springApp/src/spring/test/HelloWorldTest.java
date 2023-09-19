package spring.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.test.dto.SpringBean;

public class HelloWorldTest {
	
	public static void main(String[] args) {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:SpringTest.xml");

		SpringBean bean = (SpringBean) context.getBean("helloWorld");
		bean.show();

		context.close();
	}
}
